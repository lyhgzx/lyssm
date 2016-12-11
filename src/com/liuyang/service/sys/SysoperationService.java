package com.liuyang.service.sys;

import com.liuyang.pojo.sys.Sysoperation;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysoperationVo;

public interface SysoperationService extends BaseService<Sysoperation>{
	SysoperationVo getTable(SysoperationVo vo) throws Exception;
}
