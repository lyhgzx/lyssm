package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.SysUser;
import com.liuyang.pojo.sys.SysUserExample;
import com.liuyang.pojo.sys.SysUserExtend;

import com.liuyang.vo.sys.UserVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
   
    
    /*自定义方法*/
    SysUserExtend selectByName(String username);
    
    List<SysUserExtend> selectUsersTable(UserVo vo);
    int getAllCount();
}