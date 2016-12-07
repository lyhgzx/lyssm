package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.pojo.sys.SysmenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysmenuMapper {
    int countByExample(SysmenuExample example);

    int deleteByExample(SysmenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    List<Sysmenu> selectByExampleWithBLOBs(SysmenuExample example);

    List<Sysmenu> selectByExample(SysmenuExample example);

    Sysmenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByExampleWithBLOBs(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByExample(@Param("record") Sysmenu record, @Param("example") SysmenuExample example);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKeyWithBLOBs(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);
    
    List<Sysmenu> selectMenuByUserID(String id);
}