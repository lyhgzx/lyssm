package com.liuyang.service.sys;


import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysroleVo;

public interface SysRoleService extends BaseService<Sysrole>{
	SysroleVo getTable(SysroleVo vo) throws Exception;
}
