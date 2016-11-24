package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.SysMenu;
import com.liuyang.pojo.sys.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    int countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    
    
	/**
	 * 通过用户角色获取权限菜单
	 * 
	 * @param roleId
	 *            角色id
	 * @return 权限菜单集合
	 */
	public List<SysMenu> findMenuByRoleId(String roleId);
	
	
    
}