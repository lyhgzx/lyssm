package com.liuyang.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuyang.pojo.sys.Sysperson;
import com.liuyang.pojo.sys.SyspersonExample;
import com.liuyang.pojo.sys.SyspersonExtend;
import com.liuyang.vo.sys.SysPersonVo;

public interface SyspersonMapper {
    int countByExample(SyspersonExample example);

    int deleteByExample(SyspersonExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysperson record);

    int insertSelective(Sysperson record);

    List<Sysperson> selectByExample(SyspersonExample example);

    Sysperson selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysperson record, @Param("example") SyspersonExample example);

    int updateByExample(@Param("record") Sysperson record, @Param("example") SyspersonExample example);

    int updateByPrimaryKeySelective(Sysperson record);

    int updateByPrimaryKey(Sysperson record);
    
    /*自定义方法*/
    
    List<String> selectRoleIdsByUserID(String id);
    
    SyspersonExtend selectByName(String username);
    
    List<SyspersonExtend> selectTable(SysPersonVo vo);
    
    int getAllCount();
    
    int deleteByIds(String[] ids);
}