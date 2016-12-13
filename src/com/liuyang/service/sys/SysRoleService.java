package com.liuyang.service.sys;


import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.RoleMenuOperationVo;
import com.liuyang.vo.sys.RoleMenuVo;
import com.liuyang.vo.sys.RoleOperationVo;
import com.liuyang.vo.sys.SysroleVo;
import com.liuyang.vo.sys.SysrolesyspersonVo;

public interface SysRoleService extends BaseService<Sysrole>{
	SysroleVo getTable(SysroleVo vo) throws Exception;
	
	SysroleVo getRoleByPerson(SysroleVo vo) throws Exception;
	//授权用户角色分配
	void authorPersonRole(SysrolesyspersonVo vo) throws Exception;
	
    void AddSysMenuSysRoleSysOperation(RoleMenuVo vo);
    
    void DelSysMenuSysRoleSysOperation(RoleMenuVo vo);
    //角色分配的菜单的操作
    RoleMenuOperationVo getOperationTable(RoleMenuOperationVo vo);
     //角色分配操作 -授权
    void AuthorRoleOperation(RoleOperationVo vo);
     //角色分配操作 -取消授权
    void NuAuthorRoleOperation(RoleOperationVo vo);
}
