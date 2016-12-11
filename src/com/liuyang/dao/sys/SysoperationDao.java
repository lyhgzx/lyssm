package com.liuyang.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuyang.pojo.sys.Sysoperation;
import com.liuyang.pojo.sys.SysoperationExample;
import com.liuyang.pojo.sys.SysoperationExtend;
import com.liuyang.vo.sys.SysoperationVo;

public interface SysoperationDao {
    int countByExample(SysoperationExample example);

    int deleteByExample(SysoperationExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysoperation record);

    int insertSelective(Sysoperation record);

    List<Sysoperation> selectByExampleWithBLOBs(SysoperationExample example);

    List<Sysoperation> selectByExample(SysoperationExample example);

    Sysoperation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysoperation record, @Param("example") SysoperationExample example);

    int updateByExampleWithBLOBs(@Param("record") Sysoperation record, @Param("example") SysoperationExample example);

    int updateByExample(@Param("record") Sysoperation record, @Param("example") SysoperationExample example);

    int updateByPrimaryKeySelective(Sysoperation record);

    int updateByPrimaryKeyWithBLOBs(Sysoperation record);

    int updateByPrimaryKey(Sysoperation record);
    
    
    List<SysoperationExtend> selectTable(SysoperationVo vo);
    
    
    int deleteByIds(String[] ids);
}