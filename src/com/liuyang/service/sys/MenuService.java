package com.liuyang.service.sys;

import java.util.List;

import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.vo.sys.SysMenuVo;

public interface MenuService {
	
	  List<Sysmenu> selectMenuByUserID(String userID);
	 /**
		 * 获取角色菜单树
		 * 
		 * @param roleId
		 *            角色id
		 * @return
		 */
	 List<SysMenuVo> selectMenusTreeByUserID(String userID);
}
