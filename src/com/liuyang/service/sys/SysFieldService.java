package com.liuyang.service.sys;

import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.vo.sys.SysfieldVo;

public interface SysFieldService {
	int insert(Sysfield model) throws Exception;

	Sysfield getById(String id) throws Exception;

	void update(Sysfield model) throws Exception;

	SysfieldVo getTable(SysfieldVo vo) throws Exception;

	int delete(String ids) throws Exception;
}
