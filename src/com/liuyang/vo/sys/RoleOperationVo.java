package com.liuyang.vo.sys;

import java.util.List;

public class RoleOperationVo {
	private String roleId;
	private String menuId;
	private List<String> operationIds;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public List<String> getOperationIds() {
		return operationIds;
	}

	public void setOperationIds(List<String> operationIds) {
		this.operationIds = operationIds;
	}

}
