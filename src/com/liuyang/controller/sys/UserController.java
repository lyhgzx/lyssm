package com.liuyang.controller.sys;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.pojo.sys.SysUser;
import com.liuyang.service.impl.sys.UserServiceImpl;
import com.liuyang.utils.Config;


@Controller
@RequestMapping(value="/admin")
public class UserController extends BaseController{
	@Value("${adminPath}")  
	private String strUrl;  
	@Autowired
	private UserServiceImpl service;
	
	@RequestMapping(value = "/index")
	public String index() {
		return "sys/index";
	}
	@RequestMapping(value="/user")
	@ResponseBody
	public String getUserById(@RequestParam(value="id",required=false,defaultValue="1")String id){
		SysUser user=service.getUser(id);
       logger.info(Config.getAdminPath());
		return user.toString();
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String Login(){
		  logger.info("GET请求登录");
		  return "sys/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Object Login(String username,String password){
        logger.info("POST请求登录");
        if (StringUtils.isBlank(username)) {
            return sendError("用户名不能为空");
        }
        if (StringUtils.isBlank(password)) {
            return sendError("密码不能为空");
        }
        if(username.equals("admin")&&password.equals("888888")){
        	
        }else{
            logger.error("账号密码错误：{}");
            return sendError(2,"账号密码错误");
        }
		return sendOk();
        
	}
}
