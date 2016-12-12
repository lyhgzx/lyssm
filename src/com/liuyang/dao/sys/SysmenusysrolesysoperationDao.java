package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysmenusysrolesysoperation;
import com.liuyang.pojo.sys.SysmenusysrolesysoperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysmenusysrolesysoperationDao {
    int countByExample(SysmenusysrolesysoperationExample example);

    int deleteByExample(SysmenusysrolesysoperationExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysmenusysrolesysoperation record);

    int insertSelective(Sysmenusysrolesysoperation record);

    List<Sysmenusysrolesysoperation> selectByExample(SysmenusysrolesysoperationExample example);

    Sysmenusysrolesysoperation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysmenusysrolesysoperation record, @Param("example") SysmenusysrolesysoperationExample example);

    int updateByExample(@Param("record") Sysmenusysrolesysoperation record, @Param("example") SysmenusysrolesysoperationExample example);

    int updateByPrimaryKeySelective(Sysmenusysrolesysoperation record);

    int updateByPrimaryKey(Sysmenusysrolesysoperation record);
}