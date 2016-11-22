package com.liuyang.vo;

/**
 * 返回到前台的对象
 * 
 */
public class DataVo extends CodeVo {

	private Object data;

	public DataVo() {
	}

	public DataVo(int code) {
		super(code);
	}

	public DataVo(int code, Object data) {
		super(code);
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
