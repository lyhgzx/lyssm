package com.liuyang.controller.sys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.pojo.DropDown;
import com.liuyang.pojo.sys.SysUser;
import com.liuyang.service.CommonService;
import com.liuyang.service.sys.UserService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.DropDowmVo;
import com.liuyang.vo.sys.UserVo;

@Controller
@RequestMapping(value="/admin/sysUser")
public class UserController extends BaseController {
	@Autowired
	private UserService service;
	@Autowired
	private CommonService commonService;
	@RequestMapping("")
	public String UserList(){
		   logger.info("用户管理");
		   
		return "/sys/userList";
	}
	
	@RequestMapping(value="/findtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, UserVo vo) throws Exception{
		
		UserVo vUserVo=service.getUserTable(vo);
		return vUserVo;
	}
	
	@RequestMapping(value="/saveSysUser",method=RequestMethod.POST)
	@ResponseBody
	public Object saveSysUser(SysUser user) throws Exception{
		if(StringUtil.isBlank(user.getId())){
			logger.debug("增加用户");
			service.insert(user);
		}else{
			logger.debug("修改用户");
			service.update(user);
		}
		
		return sendOk();
	}
	
	
	@RequestMapping("/addPage")
	public String userAdd(Model model){
		
		DropDowmVo ddvDowmVo=new DropDowmVo("id", "name", "sys_role", "");
		List<DropDown> down=commonService.getDropDowm(ddvDowmVo);
		model.addAttribute("roles", down);
		model.addAttribute("status", "add");
		return "sys/userForm";
	}
	
	@RequestMapping("/updatePage")
	public String userUpdate(Model model,String id) throws Exception{
		SysUser user=service.getUser(id);
		DropDowmVo ddvDowmVo=new DropDowmVo("id", "name", "sys_role", "");
		List<DropDown> down=commonService.getDropDowm(ddvDowmVo);
		model.addAttribute("roles", down);
		model.addAttribute("user", user);
		model.addAttribute("status", "update");
		return "sys/userForm";
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
