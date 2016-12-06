package com.liuyang.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.pojo.sys.SysdepartmentExample;
import com.liuyang.pojo.sys.SysdepartmentExtend;
import com.liuyang.vo.sys.SysdepartmentVo;

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
    
    
    List<SysdepartmentExtend> selectTable(SysdepartmentVo vo);

	int getAllCount();

	int deleteByIds(String[] ids);
	
	List<Sysdepartment> selectDepartMentByParent(Sysdepartment record);
	Sysdepartment selectFirst(Sysdepartment record);
}