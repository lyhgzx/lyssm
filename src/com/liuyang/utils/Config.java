package com.liuyang.utils;

import java.util.HashMap;
import java.util.Map;


public class Config {
	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = new HashMap<String, String>();
	/**
	 * 属性加载对象
	 */
	private static PropertiesLoader loader =new PropertiesLoader("config.properties");
	
	
	/**
	 * 获取配置
	 */
	private static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getValue(key);
			map.put(key, value != null ? value : StringUtil.EMPTY);
		}
		return value;
	}
	/**
	 * 获取管理端根路径
	 * @see ${Config:getAdminPath()}
	 */
	public static String getAdminPath() {
		return getConfig("adminPath");
	}
}
