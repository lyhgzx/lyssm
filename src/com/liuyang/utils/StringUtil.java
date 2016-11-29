package com.liuyang.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * String辅助类
 * 
 */
public class StringUtil extends StringUtils {
	
	/**
	 * 非空判断
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNotBlank(Object obj) {
		return !isBlank(obj);
	}

	/**
	 * 为空判断
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isBlank(Object obj) {
		if (obj == null || StringUtils.isBlank(obj.toString())) {
			return true;
		}
		return false;
	}

}
