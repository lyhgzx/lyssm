package com.liuyang.vo.sys;

public class MenuVo {
	private String id;

	private String name;

	private String parentid;
	private String cascadeid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	public String getCascadeid() {
		return cascadeid;
	}
	public void setCascadeid(String cascadeid) {
		this.cascadeid = cascadeid;
	}
	
}
