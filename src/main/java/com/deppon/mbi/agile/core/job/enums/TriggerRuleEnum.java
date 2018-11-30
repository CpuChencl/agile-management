package com.deppon.mbi.agile.core.job.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 触发器规则枚举类
 */
public enum TriggerRuleEnum {
	TWO_MINUTE("0 0-59/2 * * * ?", "每两分钟"),
	HALF_HOUR("0 0-59/30 * * * ?", "每30分钟"),
	FIFTY_MINUTE("0 0 0-59/50 * * ?", "小时"),
	HOUR("0 0 0-23 * * ?", "每小时"),
	THREE_HOUR("0 0 0-23/3 * * ?", "每三小时"),
	TIME_ZERO("0 0 0 * * ?", "每天0点"),
	TIME_TWO("0 0 2 * * ?","凌晨2点"),
	TIME_SIX("0 0 6 * * ?","每天6点"),
	TIME_FIFTEEN("0 0 15 * * ?","每天15点");

    private TriggerRuleEnum(String index, String name) {
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
        for(TriggerRuleEnum triggerRule : TriggerRuleEnum.values()) {
            if (triggerRule.index.equals(v)){
                sname = triggerRule.name;
            }
        }
        return sname;
    }
    /**
     * 枚举类转换为List
     *
     * @return
     */
    public static List<TriggerRuleEnum> getList(){
        ArrayList<TriggerRuleEnum> list = new ArrayList<TriggerRuleEnum>();
        for(TriggerRuleEnum triggerRule : TriggerRuleEnum.values()){
            list.add(triggerRule);
        }
        return list;
    }
}
