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
import com.liuyang.service.sys.SysPersonService;
import com.liuyang.service.sys.SysRoleService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.SysPersonVo;
import com.liuyang.vo.sys.SysfieldVo;
import com.liuyang.vo.sys.SysroleVo;


@Controller
@RequestMapping(value="/admin/role")
public class RoleController extends BaseController {
	@Autowired
	private  SysRoleService service;
	
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
	
}
