package com.liuyang.controller.sys;


import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.utils.DigestUtil;




/**
  * @ClassName: UserController
  * @Description: 用户控制器
  * @author liuyang
  * @date 2016年11月24日 上午8:46:11
  *
  */
@Controller
@RequestMapping(value="/admin")
public class SysController extends BaseController{
	@Value("${adminPath}")  
	private String strUrl;  


	@RequestMapping(value = "/index")
	public String index() {
		return "sys/index";
	}

	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String Login(){
		  logger.info("GET请求登录");
		  return "sys/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Object Login(String username,String password) throws Exception{
        logger.info("POST请求登录");
        if (StringUtils.isBlank(username)) {
            return sendError("用户名不能为空");
        }
        if (StringUtils.isBlank(password)) {
            return sendError("密码不能为空");
        }
        Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, DigestUtil.md5Hex(password).toCharArray());
        token.setRememberMe(true);
        try {
            user.login(token);
 
 
        } catch (UnknownAccountException e) {
            logger.error("账号不存在：{}", e.getMessage());
            return sendError(2,"账号不存在");
        } catch (DisabledAccountException e) {
            logger.error("账号已禁用：{}", e.getMessage());
            return sendError(2,"账号已禁用");
        } catch (IncorrectCredentialsException e) {
            logger.error("密码错误：{}", e.getMessage());
            return sendError(2,"密码错误");
        } catch (RuntimeException e) {
            logger.error("未知错误,请联系管理员：{}", e.getMessage());
            return sendError("未知错误,请联系管理员");
        }
        return sendOk();
        
	}
	

    /**
     * 退出登录
     * @return {Result}
     */
    @RequestMapping(value = "/logout")
    @ResponseBody
    public Object logout() {
        logger.info("退出登录");
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return sendOk();
    }
	
	
	
	
	
	
	
}
