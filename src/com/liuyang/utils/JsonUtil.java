package com.liuyang.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * json工具类
 * @author liuyang
 *
 */
public class JsonUtil extends ObjectMapper {

	private static final long serialVersionUID = -9080973806349701775L;
	private static ObjectMapper mapper;
	private final static SimpleDateFormat YMDHMS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	static {
		mapper = new JsonUtil();
	}
	
	public JsonUtil(){
		this.setDateFormat(YMDHMS);  
	}

	public static ObjectMapper getMapper() {
		return mapper;
	}

	public static String toString(Object value) {
		try {
			return mapper.writeValueAsString(value);
		} catch (IOException e) {
		}
		return null;
	}

	public static <T> T toObject(String json, Class<T> clz) {
		if (json == null)
			return null;
		try {
			return (T) mapper.readValue(json, clz);
		} catch (IOException e) {
		}
		return null;
	}

}