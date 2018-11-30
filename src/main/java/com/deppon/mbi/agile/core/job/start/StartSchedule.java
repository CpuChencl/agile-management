package com.deppon.mbi.agile.core.job.start;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.util.CollectionUtils;

import com.deppon.mbi.agile.core.job.common.Constants;
import com.deppon.mbi.agile.core.job.entity.ScheduleTask;
import com.deppon.mbi.agile.core.job.task.Task;
import com.deppon.mbi.agile.core.job.task.TaskContainer;
import com.deppon.mbi.agile.core.job.task.TaskException;
import com.deppon.mbi.agile.core.job.task.Tasks;
import com.deppon.mbi.agile.core.job.trigger.Trigger;
import com.deppon.mbi.agile.core.job.trigger.TriggerException;
import com.deppon.mbi.agile.core.job.work.JobException;
import com.deppon.mbi.agile.core.job.work.impl.ReflectionJob;

/**
 * 调度平台入口类(其他平台调用时只需通过构造函数的方式配置相应的bean即可)
 * @author chencl
 *
 */
public class StartSchedule {

	private static Logger logger = Logger.getLogger(StartSchedule.class);
	
	//任务容器
	private static TaskContainer taskContainer;
	
	//构造函数
	public StartSchedule(String defaultJobClass, String defaultJobMethod, String defaultTaskTrigger){
		
		taskContainer = initContainer();
		//创建一个监控和读取数据表的作业
		ReflectionJob job = new ReflectionJob();
		Trigger trigger;
		try {
			job.setClass(defaultJobClass);
			job.setMethod(defaultJobMethod);
			trigger = (Trigger) new CronTrigger(defaultTaskTrigger);
			//创建一个守护任务(该任务监控数据表)
			Task daemonTask = new Task(Constants.DEFAULT_TASK, job, trigger);
			taskContainer.addTask(daemonTask);
			//以守护线程的方式启动容器
			taskContainer.start(true);
		} catch (TaskException e) {
			logger.error("daemon task init exception:"+ e.getMessage());
		} catch (JobException e) {
			logger.error("daemon job init exception:"+ e.getMessage());
		}
	}
	
	/**
	 * 初始化任务容器
	 * @return
	 */
	public static TaskContainer initContainer(){
		if(null == taskContainer){
			taskContainer = new TaskContainer();
		}
		return taskContainer;
	}
	
	/**
	 * 监控数据表和读取数据表中的数据
	 */
	public static void monitorAndReadDB(){
		try {
			List<ScheduleTask> dbTaskList = new ArrayList();//ScheduleTaskServiceImpl().selectTaskList();
			if(CollectionUtils.isEmpty(dbTaskList)){
				return ;
			}
			for(ScheduleTask dbTask : dbTaskList){
				startTask(dbTask);
			}
		} catch (Exception e) {
			logger.error("monitor db exception:"+e.getMessage());
		}
	}
	
	/**
	 * 开启任务
	 * @param taskRuleMap  任务参数
	 */
	public static void startTask(ScheduleTask dbTask){
		Task task = null;
		int taskType = dbTask.getTaskType();
		logger.error("dbTask:"+dbTask.toString());
		try {
			if(taskType == 1){
				task = Tasks.getUrlTask(dbTask);
			} else if(taskType == 2){
				task = Tasks.getClassTask(dbTask);
			}
		} catch (JobException e) {
			logger.error("init job exception:"+e.getMessage());
		} catch (TriggerException e) {
			logger.error("init trigger exception:"+e.getMessage());
		}
		try {
			taskContainer.addTask(task,task.getGroup().getName());
			taskContainer.startTask(task.getName(),task.getGroup().getName());
		} catch (TaskException e) {
			logger.error("init task exception:"+e.getMessage());
		}
		
	}
}
