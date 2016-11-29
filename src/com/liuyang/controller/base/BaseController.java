package com.liuyang.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liuyang.vo.CodeVo;
import com.liuyang.vo.DataVo;



public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 返回成功代码{code:1}
	 */
	protected CodeVo sendOk() {
		return new CodeVo(1);
	}

	/**
	 * 返回失败代码{code:0}
	 */
	protected static CodeVo sendError() {
		return new CodeVo(0);
	}

	/**
	 * 返回指定代码{code:code}
	 */
	protected CodeVo sendCode(int code) {
		return new CodeVo(code);
	}

	/**
	 * 返回失败信息{code:0,data:error}
	 */
	protected DataVo sendError(String error) {
		return new DataVo(0, error);
	}

	/**
	 * 返回失败信息{code:code,data:error}
	 */
	protected DataVo sendError(int code, String error) {
		return new DataVo(code, error);
	}

	/**
	 * 返回成功数据{code:1,data:obj}
	 */
	protected DataVo sendData(Object obj) {
		return new DataVo(1, obj);
	}

	/**
	 * 返回成功数据{code:code,data:obj}
	 */
	protected DataVo sendData(int code, Object obj) {
		return new DataVo(code, obj);
	}
}
