package com.liuyang.service.sys;

import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysfieldVo;

public interface SysFieldService extends BaseService<Sysfield> {
	

	SysfieldVo getTable(SysfieldVo vo) throws Exception;


}
