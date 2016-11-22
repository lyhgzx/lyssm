package com.liuyang.service.impl.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.liuyang.dao.sys.SysMenuMapper;
import com.liuyang.pojo.sys.SysMenu;
import com.liuyang.service.sys.MenuService;

public class MenuServiceImpl implements MenuService {

	@Autowired
	private SysMenuMapper dao;
	
	@Override
	public List<SysMenu> findMenuByRoleId(String roleId) {
		
		return dao.findMenuByRoleId(roleId);
	}

}
