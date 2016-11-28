package com.liuyang.utils;

import java.util.HashMap;
import java.util.Map;


/**
  * @ClassName: Config
  * @Description: TODO
  * @author liuyang
  * @date 2016年11月28日 上午11:18:18
  *
  */
/**
  * @ClassName: Config
  * @Description: TODO
  * @author liuyang
  * @date 2016年11月28日 上午11:18:25
  *
  */
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
	/**
	 * 
	  * getContextPath()
	  *
	  * @Title: getContextPath
	  * @Description: 获取项目上下文路径
	  * @param @return    设定文件
	  * @return String    返回类型
	  * @throws
	 */
	public static String getContextPath(){
		return getConfig("contextPath");
	}
}
