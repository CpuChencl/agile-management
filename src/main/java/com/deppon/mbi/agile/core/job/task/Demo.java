package com.deppon.mbi.agile.core.job.task;

public class Demo {
	
	public static void main(String arg[]) throws Exception {
		
//		Task task = new Task();
//		Job job = new Job() {
//			public String getName() {
//				return "DelayJob";
//			}
//	
//			public boolean execute() throws JobException {
//				System.out.println("Now is : " + new Date().toString());
//				return true;
//			}
//		};
//	
//		task.setName("HelloJob");
//		task.setJob(job);
//		task.setTrigger(new CronTrigger("0-30/5 * * * * * *"));
		
		Task task = Tasks.getMyTask();
		
		TaskContainer container = new TaskContainer();
		container.addTask(task);
		container.start();
	}
}
