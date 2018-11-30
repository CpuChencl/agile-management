package com.deppon.mbi.agile.core.job.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    protected String fields;

    public ScheduleTaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameIsNull() {
            addCriterion("JOB_CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobClassNameIsNotNull() {
            addCriterion("JOB_CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassNameEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME =", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME <>", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameGreaterThan(String value) {
            addCriterion("JOB_CLASS_NAME >", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME >=", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameLessThan(String value) {
            addCriterion("JOB_CLASS_NAME <", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_NAME <=", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameLike(String value) {
            addCriterion("JOB_CLASS_NAME like", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotLike(String value) {
            addCriterion("JOB_CLASS_NAME not like", value, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameIn(List<String> values) {
            addCriterion("JOB_CLASS_NAME in", values, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotIn(List<String> values) {
            addCriterion("JOB_CLASS_NAME not in", values, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_NAME between", value1, value2, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassNameNotBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_NAME not between", value1, value2, "jobClassName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameIsNull() {
            addCriterion("JOB_CLASS_METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameIsNotNull() {
            addCriterion("JOB_CLASS_METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameEqualTo(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME =", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameNotEqualTo(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME <>", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameGreaterThan(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME >", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME >=", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameLessThan(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME <", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameLessThanOrEqualTo(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME <=", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameLike(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME like", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameNotLike(String value) {
            addCriterion("JOB_CLASS_METHOD_NAME not like", value, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameIn(List<String> values) {
            addCriterion("JOB_CLASS_METHOD_NAME in", values, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameNotIn(List<String> values) {
            addCriterion("JOB_CLASS_METHOD_NAME not in", values, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_METHOD_NAME between", value1, value2, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andJobClassMethodNameNotBetween(String value1, String value2) {
            addCriterion("JOB_CLASS_METHOD_NAME not between", value1, value2, "jobClassMethodName");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleIsNull() {
            addCriterion("TRIGGER_RULE is null");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleIsNotNull() {
            addCriterion("TRIGGER_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleEqualTo(String value) {
            addCriterion("TRIGGER_RULE =", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleNotEqualTo(String value) {
            addCriterion("TRIGGER_RULE <>", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleGreaterThan(String value) {
            addCriterion("TRIGGER_RULE >", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_RULE >=", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleLessThan(String value) {
            addCriterion("TRIGGER_RULE <", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_RULE <=", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleLike(String value) {
            addCriterion("TRIGGER_RULE like", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleNotLike(String value) {
            addCriterion("TRIGGER_RULE not like", value, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleIn(List<String> values) {
            addCriterion("TRIGGER_RULE in", values, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleNotIn(List<String> values) {
            addCriterion("TRIGGER_RULE not in", values, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleBetween(String value1, String value2) {
            addCriterion("TRIGGER_RULE between", value1, value2, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andTriggerRuleNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_RULE not between", value1, value2, "triggerRule");
            return (Criteria) this;
        }

        public Criteria andJobParametersIsNull() {
            addCriterion("JOB_PARAMETERS is null");
            return (Criteria) this;
        }

        public Criteria andJobParametersIsNotNull() {
            addCriterion("JOB_PARAMETERS is not null");
            return (Criteria) this;
        }

        public Criteria andJobParametersEqualTo(String value) {
            addCriterion("JOB_PARAMETERS =", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersNotEqualTo(String value) {
            addCriterion("JOB_PARAMETERS <>", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersGreaterThan(String value) {
            addCriterion("JOB_PARAMETERS >", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_PARAMETERS >=", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersLessThan(String value) {
            addCriterion("JOB_PARAMETERS <", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersLessThanOrEqualTo(String value) {
            addCriterion("JOB_PARAMETERS <=", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersLike(String value) {
            addCriterion("JOB_PARAMETERS like", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersNotLike(String value) {
            addCriterion("JOB_PARAMETERS not like", value, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersIn(List<String> values) {
            addCriterion("JOB_PARAMETERS in", values, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersNotIn(List<String> values) {
            addCriterion("JOB_PARAMETERS not in", values, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersBetween(String value1, String value2) {
            addCriterion("JOB_PARAMETERS between", value1, value2, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andJobParametersNotBetween(String value1, String value2) {
            addCriterion("JOB_PARAMETERS not between", value1, value2, "jobParameters");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNull() {
            addCriterion("DATA_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNotNull() {
            addCriterion("DATA_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDataVersionEqualTo(Long value) {
            addCriterion("DATA_VERSION =", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotEqualTo(Long value) {
            addCriterion("DATA_VERSION <>", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThan(Long value) {
            addCriterion("DATA_VERSION >", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("DATA_VERSION >=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThan(Long value) {
            addCriterion("DATA_VERSION <", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThanOrEqualTo(Long value) {
            addCriterion("DATA_VERSION <=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionIn(List<Long> values) {
            addCriterion("DATA_VERSION in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotIn(List<Long> values) {
            addCriterion("DATA_VERSION not in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionBetween(Long value1, Long value2) {
            addCriterion("DATA_VERSION between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotBetween(Long value1, Long value2) {
            addCriterion("DATA_VERSION not between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("CREATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("CREATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("CREATE_USER_NAME =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("CREATE_USER_NAME >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("CREATE_USER_NAME <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_NAME <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("CREATE_USER_NAME like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("CREATE_USER_NAME not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("CREATE_USER_NAME in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("CREATE_USER_NAME not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_NAME not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("UPDATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("UPDATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("UPDATE_USER_NAME >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("UPDATE_USER_NAME <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("UPDATE_USER_NAME like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("UPDATE_USER_NAME not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("UPDATE_USER_NAME in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("UPDATE_USER_NAME not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAME between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAME not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andJobUrlIsNull() {
            addCriterion("JOB_URL is null");
            return (Criteria) this;
        }

        public Criteria andJobUrlIsNotNull() {
            addCriterion("JOB_URL is not null");
            return (Criteria) this;
        }

        public Criteria andJobUrlEqualTo(String value) {
            addCriterion("JOB_URL =", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlNotEqualTo(String value) {
            addCriterion("JOB_URL <>", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlGreaterThan(String value) {
            addCriterion("JOB_URL >", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_URL >=", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlLessThan(String value) {
            addCriterion("JOB_URL <", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlLessThanOrEqualTo(String value) {
            addCriterion("JOB_URL <=", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlLike(String value) {
            addCriterion("JOB_URL like", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlNotLike(String value) {
            addCriterion("JOB_URL not like", value, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlIn(List<String> values) {
            addCriterion("JOB_URL in", values, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlNotIn(List<String> values) {
            addCriterion("JOB_URL not in", values, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlBetween(String value1, String value2) {
            addCriterion("JOB_URL between", value1, value2, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andJobUrlNotBetween(String value1, String value2) {
            addCriterion("JOB_URL not between", value1, value2, "jobUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Short value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Short value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Short value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Short value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Short value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Short> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Short> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Short value1, Short value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Short value1, Short value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIsNull() {
            addCriterion("TASK_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIsNotNull() {
            addCriterion("TASK_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupEqualTo(String value) {
            addCriterion("TASK_GROUP =", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNotEqualTo(String value) {
            addCriterion("TASK_GROUP <>", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupGreaterThan(String value) {
            addCriterion("TASK_GROUP >", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_GROUP >=", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupLessThan(String value) {
            addCriterion("TASK_GROUP <", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupLessThanOrEqualTo(String value) {
            addCriterion("TASK_GROUP <=", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupLike(String value) {
            addCriterion("TASK_GROUP like", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNotLike(String value) {
            addCriterion("TASK_GROUP not like", value, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIn(List<String> values) {
            addCriterion("TASK_GROUP in", values, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNotIn(List<String> values) {
            addCriterion("TASK_GROUP not in", values, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupBetween(String value1, String value2) {
            addCriterion("TASK_GROUP between", value1, value2, "taskGroup");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNotBetween(String value1, String value2) {
            addCriterion("TASK_GROUP not between", value1, value2, "taskGroup");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}