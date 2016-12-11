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
import com.liuyang.pojo.sys.Sysoperation;
import com.liuyang.service.sys.SysoperationService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.SysfieldVo;
import com.liuyang.vo.sys.SysoperationVo;


@Controller
@RequestMapping(value="/admin/operation")
public class OperationController extends BaseController {
	@Autowired
	private  SysoperationService service;
	
	@RequestMapping("")
	public String showTable(){
		   logger.info("操作管理");
		   
		return "/sys/operationList";
	}
	
	@RequestMapping(value="/findtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, SysoperationVo vo) throws Exception{
		
	 SysoperationVo vpersonVo=service.getTable(vo);
		return vpersonVo;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Object save(Sysoperation model) throws Exception{
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
		return "sys/operationForm";
	}
	
	@RequestMapping("/updatePage")
	public String Update(Model model,String id) throws Exception{
		Sysoperation domain=service.getById(id);
		
		model.addAttribute("model", domain);
		model.addAttribute("status", "update");
		return "sys/operationForm";
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
