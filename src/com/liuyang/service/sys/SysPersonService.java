package com.liuyang.service.sys;


import com.liuyang.pojo.sys.Sysperson;
import com.liuyang.vo.sys.SysPersonVo;


public interface SysPersonService {
	
    int insert(Sysperson record) throws Exception;
	
     Sysperson getUser(String id) throws Exception;
	
     Sysperson getUserByName(String username ) throws Exception;
	
	void update(Sysperson user) throws Exception;
	
	SysPersonVo getUserTable(SysPersonVo vo) throws Exception;
	
	int delete(String ids) throws Exception;
}
