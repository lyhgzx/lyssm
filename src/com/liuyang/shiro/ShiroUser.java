package com.liuyang.shiro;

import java.io.Serializable;
import java.util.List;

/**
 * 登录会话对象
 * @author liuyang
 *
 */
public class ShiroUser implements Serializable {

	private static final long serialVersionUID = -5719152551062841348L;
	// 用户id
	private String id;
	// 登陆账号
	private String username;
	// 用户姓名
	private String name;
	
	private List<String> roleIds;
	
	public ShiroUser(String id, String username, String name) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
	}
	
	public List<String> getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




    




}