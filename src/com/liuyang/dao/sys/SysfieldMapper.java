package com.liuyang.dao.sys;

import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.pojo.sys.SysfieldExample;
import com.liuyang.pojo.sys.SysfieldExtend;
import com.liuyang.vo.sys.SysfieldVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysfieldMapper {
	 int countByExample(SysfieldExample example);

	    int deleteByExample(SysfieldExample example);

	    int deleteByPrimaryKey(String id);

	    int insert(Sysfield record);

	    int insertSelective(Sysfield record);

	    List<Sysfield> selectByExample(SysfieldExample example);

	    Sysfield selectByPrimaryKey(String id);

	    int updateByExampleSelective(@Param("record") Sysfield record, @Param("example") SysfieldExample example);

	    int updateByExample(@Param("record") Sysfield record, @Param("example") SysfieldExample example);

	    int updateByPrimaryKeySelective(Sysfield record);

	    int updateByPrimaryKey(Sysfield record);
    
    List<SysfieldExtend> selectTable(SysfieldVo vo);
    
    int getAllCount();
    
    int deleteByIds(String[] ids);
}