package com.deppon.mbi.agile.core.job.common;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

public class LogAppender extends DailyRollingFileAppender {

    @Override
    public boolean isAsSevereAsThreshold(Priority priority) {
        // 只判断是否相等，而不判断优先级
        return this.getThreshold().equals(priority);
    }
}