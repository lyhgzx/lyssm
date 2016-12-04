package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.pojo.sys.SysdepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysdepartmentMapper {
    int countByExample(SysdepartmentExample example);

    int deleteByExample(SysdepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysdepartment record);

    int insertSelective(Sysdepartment record);

    List<Sysdepartment> selectByExampleWithBLOBs(SysdepartmentExample example);

    List<Sysdepartment> selectByExample(SysdepartmentExample example);

    Sysdepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysdepartment record, @Param("example") SysdepartmentExample example);

    int updateByExampleWithBLOBs(@Param("record") Sysdepartment record, @Param("example") SysdepartmentExample example);

    int updateByExample(@Param("record") Sysdepartment record, @Param("example") SysdepartmentExample example);

    int updateByPrimaryKeySelective(Sysdepartment record);

    int updateByPrimaryKeyWithBLOBs(Sysdepartment record);

    int updateByPrimaryKey(Sysdepartment record);
}