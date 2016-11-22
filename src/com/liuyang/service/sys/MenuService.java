package com.liuyang.service.sys;

import java.util.List;


import com.liuyang.pojo.sys.SysMenu;
import com.liuyang.vo.sys.SysMenuVo;

public interface MenuService {
	 List<SysMenu> findMenuByRoleId(String roleId);
	 /**
		 * 获取角色菜单树
		 * 
		 * @param roleId
		 *            角色id
		 * @return
		 */
	 List<SysMenuVo> findMenusByRoleId(String roleId);
}
