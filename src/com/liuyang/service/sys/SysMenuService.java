package com.liuyang.service.sys;

import java.util.List;

import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysMenuVo;
import com.liuyang.vo.sys.SysMenuVo2;

public interface SysMenuService extends BaseService<Sysmenu>{

	List<Sysmenu> selectMenuByUserID(String userID);

	/**
	 * 获取角色菜单树
	 * 
	 * @param roleId
	 *            角色id
	 * @return
	 */
	List<SysMenuVo> selectMenusTreeByUserID(String userID);

	/**
	 * 获取菜单树数据
	 * 
	 * @return
	 */
	List<Sysmenu> getList();

	/**
	 * 获取菜单列表数据
	 * 
	 * @param vo
	 * @return
	 */
	SysMenuVo2 GetSubOrgs(SysMenuVo2 vo);
}
