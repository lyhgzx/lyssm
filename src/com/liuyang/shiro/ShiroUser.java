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
	//角色名称
	private String roleName;

    public ShiroUser(String id, String username, String name, String roleId,String roleName) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.roleId = roleId;
        this.roleName=roleName;
    }

    public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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