package com.deppon.mbi.agile.core.job.task;

/**
 * 任务异常
 * 
 */
public class TaskException extends Exception {

	private static final long serialVersionUID = 1L;

	public TaskException() {
		super();
	}

	public TaskException(String message) {
		super(message);
	}

	public TaskException(Throwable cause) {
		super(cause);
	}

	public TaskException(String message, Throwable cause) {
		super(message, cause);
	}

}
