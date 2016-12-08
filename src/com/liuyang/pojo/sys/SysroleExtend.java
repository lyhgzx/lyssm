package com.liuyang.pojo.sys;

import java.io.Serializable;

public class SysroleExtend extends Sysrole implements Serializable  {
     //是否授权
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}