package com.deppon.mbi.agile.core.job.monitor;

import java.util.Collection;

import org.apache.log4j.Logger;

import com.deppon.mbi.agile.core.job.task.Task;
import com.deppon.mbi.agile.core.job.task.TaskContainer;
import com.deppon.mbi.agile.core.job.task.TaskContainerDaemon;
import com.deppon.mbi.agile.core.job.task.TaskGroup;

/**
 * 任务容器监控服务类
* @ClassName: TaskContainerMonitor 
* @author chencl
* @date 2017年4月24日 下午4:27:24 
*
 */
public class TaskContainerMonitor {

	private static Logger logger = Logger.getLogger(TaskContainerMonitor.class);
	/**
	 * 任务管理
	* @Title: managerTask 
	* @param container 任务容器
	* @Author chencl
	* @Date 2017年4月24日下午4:28:36
	 */
	public static void managerTask(TaskContainer container){
		if(null == container){
			return ;
		}
		//守护线程的状态
		TaskContainerDaemon daemon = container.getDaemon();
		Thread t = daemon.getDaemonThread();
		logger.info("守护线程线程名：" + t.getName() + "线程状态:" + t.getState());
		//容器中的任务组
		Collection<TaskGroup> taskGroups = container.getTaskGroup();
		if(null == taskGroups){
			return ;
		}
		for (TaskGroup tg : taskGroups) {
			if(null == tg){
				continue ;
			}
			logger.info("当前任务组名为:" + tg.getName()+ "|"+"==状态为:"+ tg.getStatus());
			//任务组中的任务
			Collection<Task> tasks = tg.getTasks();
			if(null == tasks){
				continue ;
			}
			for(Task task : tasks){
				if(null == task){
					continue ;
				}
				logger.info("当前任务名:"+ task.getName() +"|"+ "--状态为:"+ task.getStatus());
			}
		}
		
	}
}
