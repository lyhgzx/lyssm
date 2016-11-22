package com.liuyang.shiro;

import java.io.Serializable;

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
	// 角色id
	private String roleId;

    public ShiroUser(String id, String username, String name, String roleId) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.roleId = roleId;
    }

    public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public String getRoleId() {
		return roleId;
	}

}