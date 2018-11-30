package com.deppon.mbi.agile.core.job.task;

import org.apache.commons.lang3.StringUtils;

import com.deppon.mbi.agile.core.job.entity.ScheduleTask;
import com.deppon.mbi.agile.core.job.start.StartSchedule;
import com.deppon.mbi.agile.core.job.trigger.TriggerException;
import com.deppon.mbi.agile.core.job.trigger.impl.CronTrigger;
import com.deppon.mbi.agile.core.job.work.Job;
import com.deppon.mbi.agile.core.job.work.JobException;
import com.deppon.mbi.agile.core.job.work.impl.MyJob;
import com.deppon.mbi.agile.core.job.work.impl.ReflectionJob;

/**
 * 构建任务类
* @ClassName: Tasks 
* @author chencl
* @date 2017年4月25日 上午11:03:46 
*
 */
public class Tasks {
	
	/**
	 * 构建执行class的任务
	* @Title: getClassTask
	* @param dbTask			数据库中任务
	* @throws JobException
	* @throws TriggerException
	* @return Task 			返回构建成功的任务
	* @Author chencl
	* @Date 2017年4月25日上午11:04:07
	 */
	public static Task getClassTask(ScheduleTask dbTask) throws JobException, TriggerException {
		
		Task task = new Task();
		if(null == dbTask){
			return task;
		}
		//创建反射类型的作业
		ReflectionJob job = new ReflectionJob();
		job.setClass(dbTask.getJobClassName());
		job.setMethod(dbTask.getJobClassMethodName());
		String parameter = dbTask.getJobParameters();
		if(StringUtils.isNotEmpty(parameter)){
			job.setParameters(parameter.split(","));
		}

		task.setName(dbTask.getTaskName());
		task.setJob(job);
		task.setGroup(new TaskGroup(dbTask.getTaskGroup()));
		task.setTrigger(new CronTrigger(dbTask.getTriggerRule()));
		return task;
	}
	
	/**
	 * 构建执行url的任务
	* @Title: getUrlTask 
	* @param dbTask			数据库中的任务
	* @throws JobException
	* @throws TriggerException
	* @return Task 
	* @Author chencl
	* @Date 2017年4月25日上午11:06:12
	 */
	public static Task getUrlTask(final ScheduleTask dbTask) throws JobException, TriggerException {
		
		Task task = new Task();
		if(null == dbTask){
			return task;
		}
		//创建作业
		Job job = new Job() {
			public String getName() {
				return dbTask.getTaskName();
			}
			//作业执行的事件
			public boolean execute() throws JobException {
				//TODO 执行 请求url 操作
				return true;
			}
		};
		task.setName(dbTask.getTaskName());
		task.setJob(job);
		task.setGroup(new TaskGroup(dbTask.getTaskGroup()));
		task.setTrigger(new CronTrigger(dbTask.getTriggerRule()));
		return task;
	}
	
	//守护任务
	public static void addDeamonTask(){
		StartSchedule.monitorAndReadDB();
	}

	
	public static Task getMyTask() throws TriggerException {
		Task task = new Task();
		MyJob job = new MyJob();

		task.setName("MyJob");
		task.setJob(job);
		task.setTrigger(new CronTrigger("0 0-59/1 * * * * *"));
		return task;
	}
}
