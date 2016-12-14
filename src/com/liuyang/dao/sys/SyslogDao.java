package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Syslog;
import com.liuyang.pojo.sys.SyslogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyslogDao {
    int countByExample(SyslogExample example);

    int deleteByExample(SyslogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Syslog record);

    int insertSelective(Syslog record);

    List<Syslog> selectByExampleWithBLOBs(SyslogExample example);

    List<Syslog> selectByExample(SyslogExample example);

    Syslog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByExampleWithBLOBs(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByExample(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByPrimaryKeySelective(Syslog record);

    int updateByPrimaryKeyWithBLOBs(Syslog record);

    int updateByPrimaryKey(Syslog record);
}