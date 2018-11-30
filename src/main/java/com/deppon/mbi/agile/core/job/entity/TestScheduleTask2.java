package com.deppon.mbi.agile.core.job.entity;

import java.io.Serializable;

public class TestScheduleTask2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3800227347045241021L;

	/**
     * 主键
     */
    private String id;

    /**
     * 任务名
     */
    private String taskName;

    /**
     * 创建时间
     */
    private String createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}