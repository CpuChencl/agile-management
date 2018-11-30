package com.deppon.mbi.agile.core.job.listner;

/**
 * 任务监听器
 */
public interface TaskListener {
	/**
	 * Task执行start后执行
	 */
	public void start();

	/**
	 * Task执行stop后执行
	 */
	public void finish();
}
