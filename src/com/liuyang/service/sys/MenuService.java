package com.liuyang.service.sys;

import java.util.List;

import com.liuyang.pojo.sys.SysMenu;

public interface MenuService {
	 List<SysMenu> findMenuByRoleId(String roleId);
}
