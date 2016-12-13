package com.liuyang.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.pojo.sys.Sysperson;
import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.service.sys.SysFieldService;
import com.liuyang.service.sys.SysMenuService;
import com.liuyang.service.sys.SysPersonService;
import com.liuyang.service.sys.SysRoleService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.RoleMenuOperationVo;
import com.liuyang.vo.sys.RoleMenuVo;
import com.liuyang.vo.sys.RoleOperationVo;
import com.liuyang.vo.sys.SysPersonVo;
import com.liuyang.vo.sys.SysfieldVo;
import com.liuyang.vo.sys.SysroleVo;
import com.liuyang.vo.sys.SysrolesyspersonVo;


@Controller
@RequestMapping(value="/admin/role")
public class RoleController extends BaseController {
	@Autowired
	SysRoleService service;
	@Autowired
	SysMenuService menuService;
	
	@RequestMapping("")
	public String showTable(){
		   logger.info("角色管理");
		   
		return "/sys/roleList";
	}
	
	@RequestMapping(value="/findtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, SysroleVo vo) throws Exception{
		
	  SysroleVo vpersonVo=service.getTable(vo);
		return vpersonVo;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Object save(Sysrole model) throws Exception{
		if(StringUtil.isBlank(model.getId())){

			service.insert(model);
		}else{
			
			service.update(model);
		}
		
		return sendOk();
	}
	
	@RequestMapping("/addPage")
	public String Add(Model model){
		
	
		model.addAttribute("status", "add");
		return "sys/roleForm";
	}
	
	@RequestMapping("/updatePage")
	public String Update(Model model,String id) throws Exception{
		Sysrole sysfield=service.getById(id);
		
		model.addAttribute("model", sysfield);
		model.addAttribute("status", "update");
		return "sys/roleForm";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(String ids) throws Exception{
		if(StringUtil.isNotBlank(ids)){
			service.delete(ids);
			return sendOk();
		}else{
			return sendError();
		}
		
		
	}
	/**
	 * 用户分配角色
	 * @param personId
	 * @return
	 */
	@RequestMapping("/GivePersonRole")
	public String GivePersonRole(String personId,Model model){
		model.addAttribute("personid", personId);
		return "sys/GivePersonRoleList";
	}
	
	//用户角色授权表
	@RequestMapping(value="/GivePersonRoletable",method=RequestMethod.POST)
	@ResponseBody
	public Object GivePersonRoletable(HttpServletRequest request, SysroleVo vo) throws Exception{
		
	  SysroleVo vpersonVo=service.getRoleByPerson(vo);
		return vpersonVo;
	}
	
	
	@RequestMapping(value="/author",method=RequestMethod.POST)
	@ResponseBody
	public Object author(SysrolesyspersonVo vo) throws Exception{
		  
		try {
			service.authorPersonRole(vo);
			return sendOk();
		} catch (Exception e) {
			return sendError();
		}
		
	}
	/**
	 * 为角色分配菜单
	 * @param id
	 * @return
	 */
	@RequestMapping("/rolemenu")
	public String rolemenu(String id,Model model){
		model.addAttribute("id", id);
		return "sys/roleMenu";
	}
	/**
	 * 为角色分配操作
	 * @param id
	 * @return
	 */
	@RequestMapping("/roleoperation")
	public String roleoperation(String id,Model model){
		model.addAttribute("id", id);
		return "sys/roleOperation";
	}
	/**
	 * 所有的菜单
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/getallmenus")
	@ResponseBody
	public Object getAllMenus() throws Exception{

			return menuService.selectAllMenus();

	}
	/**
	 * 当前角色已经分配的菜单
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/getgivemenus")
	@ResponseBody
	public Object getGiveMenus(String id) throws Exception{

			return menuService.selectGiveMenusByRoleId(id);

	}
	/**
	 * 为角色分配菜单--授权选中
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/AddSysMenuSysRoleSysOperation",method=RequestMethod.POST)
	@ResponseBody
	public Object AddSysMenuSysRoleSysOperation(RoleMenuVo vo) throws Exception{
		  
		try {
			service.AddSysMenuSysRoleSysOperation(vo);
			return sendOk();
		} catch (Exception e) {
			return sendError();
		}
		
	}
	
	/**
	 *  为角色分配菜单--授权取消
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/DelSysMenuSysRoleSysOperation",method=RequestMethod.POST)
	@ResponseBody
	public Object DelSysMenuSysRoleSysOperation(RoleMenuVo vo) throws Exception{
		  
		try {
			service.DelSysMenuSysRoleSysOperation(vo);
			return sendOk();
		} catch (Exception e) {
			return sendError();
		}
		
	}
	
	    /**
	     * 为角色分配操作
	     * @param request
	     * @param vo
	     * @return
	     * @throws Exception
	     */
		@RequestMapping(value="/getOperationTable",method=RequestMethod.POST)
		@ResponseBody
		public Object getOperationTable(HttpServletRequest request, RoleMenuOperationVo vo) throws Exception{
			
			RoleMenuOperationVo vpersonVo=service.getOperationTable(vo);
			return vpersonVo;
		}
		
		
		/**
		 * 为角色分配操作--授权选中
		 * @param vo
		 * @return
		 * @throws Exception
		 */
		@RequestMapping(value="/AuthorRoleOperation",method=RequestMethod.POST)
		@ResponseBody
		public Object AuthorRoleOperation(RoleOperationVo vo) throws Exception{
			  
			try {
				service.AuthorRoleOperation(vo);
				return sendOk();
			} catch (Exception e) {
				return sendError();
			}
			
		}
		
		/**
		 *  为角色分配操作--授权取消
		 * @param vo
		 * @return
		 * @throws Exception
		 */
		@RequestMapping(value="/NuAuthorRoleOperation",method=RequestMethod.POST)
		@ResponseBody
		public Object NuAuthorRoleOperation(RoleOperationVo vo) throws Exception{
			  
			try {
				service.NuAuthorRoleOperation(vo);
				return sendOk();
			} catch (Exception e) {
				return sendError();
			}
			
		}
		
}
