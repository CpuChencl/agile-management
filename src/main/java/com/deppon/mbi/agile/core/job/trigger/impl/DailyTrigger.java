package com.deppon.mbi.agile.core.job.trigger.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;



/**
 * 日期触发器
 */
public class DailyTrigger extends EverydayTrigger {

	private List<String> dayList = new ArrayList<String>();

	@Override
	public boolean match(Date now) {

		String date = new SimpleDateFormat("yyyy/MM/dd").format(now);

		if (this.dayList.contains(date)) {
			return super.match(now);
		} else {
			return false;
		}

	}

	/**
	 * <p>设置触发日期</p>
	 * 
	 * <p>
	 * 日期格式为: 'yyyy/mm/dd' 同时支持多个日期使用 ';' 进行分割 
	 * 例如 '2015/03/04 ; 2015/05/05'
	 * </p>
	 * 
	 * @param dateText 触发日期
	 */
	public void setDate(String dateText) {
		if (StringUtils.isNotEmpty(dateText)) {
			if (dateText.contains(";")) {
				String dates[] = dateText.split(";");
				for (String date : dates) {
					if (StringUtils.isNotEmpty(date)) {
						this.dayList.add(date.trim());
					}
				}
			} else {
				this.dayList.add(dateText);
			}
		}
	}
}
