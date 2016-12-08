package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.pojo.sys.SysroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysroleDao {
    int countByExample(SysroleExample example);

    int deleteByExample(SysroleExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    List<Sysrole> selectByExampleWithBLOBs(SysroleExample example);

    List<Sysrole> selectByExample(SysroleExample example);

    Sysrole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByExampleWithBLOBs(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByExample(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKeyWithBLOBs(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}