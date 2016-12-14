package com.liuyang.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.service.sys.SysLogService;
import com.liuyang.vo.sys.SysLogVo;
import com.liuyang.vo.sys.SysfieldVo;

@Controller
@RequestMapping(value="/admin/log")
public class LogController extends BaseController {
 
	@Autowired
	SysLogService service;
	
	@RequestMapping("")
	public String showTable(){
		   logger.info("日志");
		   
		return "/sys/logList";
	}
	
	@RequestMapping(value="/logtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getlogTable(HttpServletRequest request, SysLogVo vo) throws Exception{
		
	SysLogVo vpersonVo=service.getOperationLog(vo);
		return vpersonVo;
	}
	
	@RequestMapping(value="/logintable",method=RequestMethod.POST)
	@ResponseBody
	public Object getloginTable(HttpServletRequest request, SysLogVo vo) throws Exception{
		
		SysLogVo vpersonVo=service.getLoginLog(vo);
		return vpersonVo;
	}
	
	
}
