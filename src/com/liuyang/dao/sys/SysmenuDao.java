package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.pojo.sys.SysmenuExample;
import com.liuyang.pojo.sys.SysmenuExtend;
import com.liuyang.vo.sys.MenuVo;
import com.liuyang.vo.sys.SysMenuVo2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysmenuDao {
    int countByExample(SysmenuExample example);

    int deleteByExample(SysmenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    List<Sysmenu> selectByExampleWithBLOBs(SysmenuExample example);

    List<Sysmenu> selectByExample(SysmenuExample example);

    Sysmenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByExampleWithBLOBs(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByExample(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKeyWithBLOBs(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);
    
    /*    自定义方法*/
    List<Sysmenu> selectMenuByUserID(String id);
    
    List<SysmenuExtend> selectTable(SysMenuVo2 vo);

   	int deleteByIds(String[] ids);
   
   	List<Sysmenu> selectMenuByParent(Sysmenu record);
   	
   	Sysmenu selectFirst(Sysmenu record);
   	
   	List<String> selectOperationByMenu(String menuId);
   	
   	int insertMenuOperation(Map<String, String> map);
   	
   	void deleteMenuOperationByMenuId(String menuId);
   	
   	List<MenuVo> selectAllMenus();
   	
   	List<MenuVo> selectGiveMenusByRoleId(String roleId);
   	

}