package com.liuyang.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Properties读取工具类
 * @author liuyang
 *
 */
public class PropertiesLoader {

	private static Logger logger = LoggerFactory.getLogger(PropertiesLoader.class);

	private static ResourceLoader resourceLoader = new DefaultResourceLoader();

	private final Properties properties;

	public PropertiesLoader(String... resourcesPaths) {
		properties = loadProperties(resourcesPaths);
	}

	public Properties getProperties() {
		return properties;
	}

	/**
	 * 取值
	 * 
	 * @param key
	 * @return
	 */
	public String getValue(String key) {
		if (properties.containsKey(key)) {
			return properties.getProperty(key);
		}
		throw new NoSuchElementException();
	}

	/**
	 * 取出Integer类型的数据
	 */
	public Integer getInteger(String key) {
		return Integer.valueOf(getValue(key));
	}

	/**
	 * 取出Double类型的数据
	 */
	public Double getDouble(String key) {
		return Double.valueOf(getValue(key));
	}

	/**
	 * 取出Boolean类型的数据
	 */
	public Boolean getBoolean(String key) {
		return Boolean.valueOf(getValue(key));
	}

	/**
	 * 载入多个文件
	 */
	private Properties loadProperties(String... resourcesPaths) {
		Properties props = new Properties();

		for (String location : resourcesPaths) {

			InputStream is = null;
			try {
				Resource resource = resourceLoader.getResource(location);
				is = resource.getInputStream();
				props.load(is);
			} catch (IOException ex) {
				logger.info("Could not load properties from path:" + location + ", " + ex.getMessage());
			} finally {
				IOUtils.closeQuietly(is);
			}
		}
		return props;
	}
}
