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
import com.liuyang.service.sys.SysFieldService;
import com.liuyang.service.sys.SysPersonService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.SysPersonVo;
import com.liuyang.vo.sys.SysfieldVo;


@Controller
@RequestMapping(value="/admin/field")
public class FieldController extends BaseController {
	@Autowired
	private  SysFieldService service;
	
	@RequestMapping("")
	public String personList(){
		   logger.info("字典管理");
		   
		return "/sys/fieldList";
	}
	
	@RequestMapping(value="/findtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, SysfieldVo vo) throws Exception{
		
	SysfieldVo vpersonVo=service.getTable(vo);
		return vpersonVo;
	}
	
	@RequestMapping(value="/saveForm",method=RequestMethod.POST)
	@ResponseBody
	public Object save(Sysfield model) throws Exception{
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
		return "sys/fieldForm";
	}
	
	@RequestMapping("/updatePage")
	public String Update(Model model,String id) throws Exception{
		Sysfield sysfield=service.getById(id);
		
		model.addAttribute("sysfield", sysfield);
		model.addAttribute("status", "update");
		return "sys/fieldForm";
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
