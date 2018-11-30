package com.deppon.mbi.agile.core.job.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 任务状态举类
 */
public enum TaskStatusEnum {
	STOP("1","STOP"),
	RUNNING("2","RUNNING"),
	PAUSE("3","PAUSE"),
	VALID("4","VALID"),
	INVALID("5","INVALID");

    private TaskStatusEnum(String index, String name) {
        this.index = index;
        this.name = name;
    }

    private String index;
    private String name;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getN(String v){
        String sname = "";
        for(TaskStatusEnum taskStatus : TaskStatusEnum.values()) {
            if (taskStatus.index.equals(v)){
                sname = taskStatus.name;
            }
        }
        return sname;
    }
    /**
     * 枚举类转换为List
     *
     * @return
     */
    public static List<TaskStatusEnum> getList(){
        ArrayList<TaskStatusEnum> list = new ArrayList<TaskStatusEnum>();
        for(TaskStatusEnum taskStatus : TaskStatusEnum.values()){
            list.add(taskStatus);
        }
        return list;
    }
}
