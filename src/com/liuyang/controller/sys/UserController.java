package com.liuyang.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.service.sys.UserService;
import com.liuyang.vo.sys.UserVo;

@Controller
@RequestMapping(value="/admin/sysUser")
public class UserController extends BaseController {
	@Autowired
	private UserService service;

	
	@RequestMapping("")
	public String UserList(){
		   logger.info("用户管理");
		   
		return "/sys/userList";
	}
	
	@RequestMapping(value="/findtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, UserVo vo){
		String pageNumString=request.getParameter("PageNumber");
		UserVo vUserVo=service.getUserTable(vo);
		return vUserVo;
	}
}
