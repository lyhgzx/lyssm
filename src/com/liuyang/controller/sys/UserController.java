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
		String pageNumString=request.getParameter("PageNumber");
		UserVo vUserVo=service.getUserTable(vo);
		return vUserVo;
	}
	
	@RequestMapping(value="/saveSysUser",method=RequestMethod.POST)
	@ResponseBody
	public Object saveSysUser(SysUser user) throws Exception{
		service.insert(user);
		return sendOk();
	}
	@RequestMapping("/userAdd")
	public String userAdd(Model model){
		DropDowmVo ddvDowmVo=new DropDowmVo("id", "name", "sys_role", "");
		List<DropDown> down=commonService.getDropDowm(ddvDowmVo);
		model.addAttribute("roles", down);
		return "sys/userAdd";
	}
}
