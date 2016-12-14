package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysloginhistory;
import com.liuyang.pojo.sys.SysloginhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysloginhistoryDao {
    int countByExample(SysloginhistoryExample example);

    int deleteByExample(SysloginhistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysloginhistory record);

    int insertSelective(Sysloginhistory record);

    List<Sysloginhistory> selectByExample(SysloginhistoryExample example);

    Sysloginhistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysloginhistory record, @Param("example") SysloginhistoryExample example);

    int updateByExample(@Param("record") Sysloginhistory record, @Param("example") SysloginhistoryExample example);

    int updateByPrimaryKeySelective(Sysloginhistory record);

    int updateByPrimaryKey(Sysloginhistory record);
}