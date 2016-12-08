package com.liuyang.service.sys;


import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysroleVo;
import com.liuyang.vo.sys.SysrolesyspersonVo;

public interface SysRoleService extends BaseService<Sysrole>{
	SysroleVo getTable(SysroleVo vo) throws Exception;
	
	SysroleVo getRoleByPerson(SysroleVo vo) throws Exception;
	//授权用户角色分配
	void authorPersonRole(SysrolesyspersonVo vo) throws Exception;
}
