package com.deppon.mbi.agile.core.job.entity;

import java.io.Serializable;
import java.util.Date;

public class ScheduleTask implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 任务名
     */
    private String taskName;

    /**
     * 作业类名
     */
    private String jobClassName;

    /**
     * 作业类方法名
     */
    private String jobClassMethodName;

    /**
     * 触发器规则
     */
    private String triggerRule;

    /**
     * 作业参数
     */
    private String jobParameters;

    /**
     * 数据版本号
     */
    private Long dataVersion;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人用户真实姓名
     */
    private String createUserName;

    /**
     * 修改人用户真实姓名
     */
    private String updateUserName;

    /**
     * 作业URL
     */
    private String jobUrl;

    /**
     * 任务状态(1:stop 2:running 3:pause)
     */
    private Short status;

    /**
     * 任务类型(1:执行url的任务;2:执行class的任务)
     */
    private Short taskType;

    /**
     * 任务所属组
     */
    private String taskGroup;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName == null ? null : jobClassName.trim();
    }

    public String getJobClassMethodName() {
        return jobClassMethodName;
    }

    public void setJobClassMethodName(String jobClassMethodName) {
        this.jobClassMethodName = jobClassMethodName == null ? null : jobClassMethodName.trim();
    }

    public String getTriggerRule() {
        return triggerRule;
    }

    public void setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule == null ? null : triggerRule.trim();
    }

    public String getJobParameters() {
        return jobParameters;
    }

    public void setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters == null ? null : jobParameters.trim();
    }

    public Long getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl == null ? null : jobUrl.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getTaskType() {
        return taskType;
    }

    public void setTaskType(Short taskType) {
        this.taskType = taskType;
    }

    public String getTaskGroup() {
        return taskGroup;
    }

    public void setTaskGroup(String taskGroup) {
        this.taskGroup = taskGroup == null ? null : taskGroup.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskName=").append(taskName);
        sb.append(", jobClassName=").append(jobClassName);
        sb.append(", jobClassMethodName=").append(jobClassMethodName);
        sb.append(", triggerRule=").append(triggerRule);
        sb.append(", jobParameters=").append(jobParameters);
        sb.append(", dataVersion=").append(dataVersion);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", jobUrl=").append(jobUrl);
        sb.append(", status=").append(status);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskGroup=").append(taskGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}