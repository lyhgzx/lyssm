package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysrolesysperson;
import com.liuyang.pojo.sys.SysrolesyspersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysrolesyspersonDao {
    int countByExample(SysrolesyspersonExample example);

    int deleteByExample(SysrolesyspersonExample example);

    int deleteByPrimaryKey(@Param("syspersonid") String syspersonid, @Param("sysroleid") String sysroleid);

    int insert(Sysrolesysperson record);

    int insertSelective(Sysrolesysperson record);

    List<Sysrolesysperson> selectByExample(SysrolesyspersonExample example);

    int updateByExampleSelective(@Param("record") Sysrolesysperson record, @Param("example") SysrolesyspersonExample example);

    int updateByExample(@Param("record") Sysrolesysperson record, @Param("example") SysrolesyspersonExample example);
}