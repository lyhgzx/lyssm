package com.liuyang.service.sys;

import java.util.List;
import java.util.Map;

import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.pojo.sys.SysmenuExtend;
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
	/**
	 * 
	  * selectOperationByMenu(获取菜单对应的操作信息)
	  *
	  * @Title: selectOperationByMenu
	  * @Description: TODO
	  * @param @param menuId 菜单ID
	  * @param @return    设定文件
	  * @return List<String>    操作ID集合
	  * @throws
	 */
	List<String> selectOperationByMenu(String menuId);
	/*
	 * 插入菜单操作信息
	 */
   	int insertMenuOperation(String sysMenuId,String sysOperationId);
   	
   	int insert(SysmenuExtend model);
   	void update(SysmenuExtend model);
}
