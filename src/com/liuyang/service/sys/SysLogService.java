package com.liuyang.service.sys;

import com.liuyang.vo.sys.SysLogVo;

public interface SysLogService {
	
	/**
	 * 登录日志数据
	 * @param vo
	 * @return
	 */
	SysLogVo getLoginLog(SysLogVo vo);
	
	/**
	 * 操作日志数据
	 * @param vo
	 * @return
	 */
	SysLogVo getOperationLog(SysLogVo vo);
}
