package com.liuyang.service.sys;

import com.liuyang.pojo.sys.Sysperson;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysPersonVo;

public interface SysPersonService extends BaseService<Sysperson> {

	Sysperson getUserByName(String username) throws Exception;

	SysPersonVo getTable(SysPersonVo vo) throws Exception;
    
}
