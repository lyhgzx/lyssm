package com.liuyang.controller.sys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.service.sys.SysDepartmentService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.SysdepartmentVo;

@Controller
@RequestMapping(value="/admin/department")
public class DepartmentController extends BaseController {
	@Autowired
	private  SysDepartmentService service;
	
	@RequestMapping("")
	public String showTable(){
		   logger.info("部门管理");
		   
		return "/sys/departmentList";
	}
	
	@RequestMapping(value="/findtable",method=RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, SysdepartmentVo vo) throws Exception{
		
	   SysdepartmentVo vpersonVo=service.GetSubOrgs(vo);
		return vpersonVo;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Object save(Sysdepartment model) throws Exception{
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
		return "sys/departmentForm";
	}
	
	@RequestMapping("/updatePage")
	public String Update(Model model,String id) throws Exception{
		Sysdepartment Sysdepartment=service.getById(id);
		
		model.addAttribute("model", Sysdepartment);
		model.addAttribute("status", "update");
		return "sys/departmentForm";
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
	@RequestMapping("/tree")
	@ResponseBody
	public Object getDepartmentTree(){
		List<Sysdepartment> sysdepartments=service.getList();
		Sysdepartment deSysdepartment=new Sysdepartment();
		deSysdepartment.setId(0);
		deSysdepartment.setParentid(-1);
		deSysdepartment.setName("根结点");
		deSysdepartment.setCascadeid("0");
		sysdepartments.add(deSysdepartment);
		return sysdepartments ;
	}
	@RequestMapping("/treeform")
	@ResponseBody
	public Object getDepartmentTreeForm(){
		List<Sysdepartment> sysdepartments=service.getList();
		
		return sysdepartments ;
	}
}
