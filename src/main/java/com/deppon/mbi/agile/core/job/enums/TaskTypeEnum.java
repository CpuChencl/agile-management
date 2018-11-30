package com.deppon.mbi.agile.core.job.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 任务类型枚举类
 */
public enum TaskTypeEnum {
	RUNNING_URL("1","执行url的任务"),
	RUNNING_CLASS("2","执行class的任务");

    private TaskTypeEnum(String index, String name) {
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
        for(TaskTypeEnum taskType : TaskTypeEnum.values()) {
            if (taskType.index.equals(v)){
                sname = taskType.name;
            }
        }
        return sname;
    }
    /**
     * 枚举类转换为List
     *
     * @return
     */
    public static List<TaskTypeEnum> getList(){
        ArrayList<TaskTypeEnum> list = new ArrayList<TaskTypeEnum>();
        for(TaskTypeEnum taskType : TaskTypeEnum.values()){
            list.add(taskType);
        }
        return list;
    }
}
