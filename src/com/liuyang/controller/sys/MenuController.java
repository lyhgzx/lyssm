package com.liuyang.controller.sys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.pojo.DropDown;
import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.pojo.sys.SysmenuExtend;
import com.liuyang.service.CommonService;
import com.liuyang.service.sys.SysMenuService;
import com.liuyang.utils.JsonUtil;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.DropDowmVo;
import com.liuyang.vo.sys.SysMenuVo2;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


@Controller
@RequestMapping(value = "/admin/menu")
public class MenuController extends BaseController
{
	@Autowired
	private SysMenuService service;
	@Autowired
	CommonService CommonService;
	@RequestMapping("")
	public String showTable()
	{
		logger.info("菜单管理");

		return "/sys/menuList";
	}

	@RequestMapping(value = "/findtable", method = RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, SysMenuVo2 vo) throws Exception
	{

		SysMenuVo2 vpersonVo = service.GetSubOrgs(vo);
		return vpersonVo;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Object save(SysmenuExtend model) throws Exception
	{
		if (StringUtil.isBlank(model.getId()))
		{
 
		  service.insert(model);

		} else
		{

			service.update(model);
		}

		return sendOk();
	}

	@RequestMapping("/addPage")
	public String Add(Model model)
	{
		model.addAttribute("operationIds","[]");
		model.addAttribute("status", "add");
		return "sys/menuForm";
	}

	@RequestMapping("/updatePage")
	public String Update(Model model, String id) throws Exception
	{
		
		Sysmenu Sysmenu = service.getById(id);
		model.addAttribute("model", Sysmenu);
		String jsonString=JsonUtil.toString(service.selectOperationByMenu(id));
		model.addAttribute("operationIds",jsonString.equals("")?"[]":jsonString);
		model.addAttribute("status", "update");
		return "sys/menuForm";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(String ids) throws Exception
	{
		try
		{
			if (StringUtil.isNotBlank(ids))
			{
				service.delete(ids);
				return sendOk();
			} else
			{
				return sendError();
			} 
		} catch (DataIntegrityViolationException e)
		{
			return sendError("存在菜单相关联的操作，请先删除相应操作信息");
		}

	}

	@RequestMapping("/tree")
	@ResponseBody
	public Object getmenuTree()
	{
		List<Sysmenu> sysmenus = service.getList();
		Sysmenu deSysmenu = new Sysmenu();
		deSysmenu.setId("0");
		deSysmenu.setParentid("-1");
		deSysmenu.setName("根结点");
		deSysmenu.setCascadeid("0");
		sysmenus.add(deSysmenu);
		return sysmenus;
	}

	@RequestMapping("/treeform")
	@ResponseBody
	public Object getmenuTreeForm()
	{
		List<Sysmenu> sysmenus = service.getList();

		return sysmenus;
	}
	/**
	 * 菜单-操作
	  * SysOperationSelect(菜单-操作)
	  * @Title: SysOperationSelect
	  * @Description: TODO
	  * @param @return    设定文件
	  * @return Object    返回类型
	  * @throws
	 */
	@RequestMapping("/operationSelect")
	@ResponseBody
	public Object SysOperationSelect(){
		DropDowmVo vo =new DropDowmVo("id", "name", "sysoperation","");
		List<DropDown> dropDowns=CommonService.getDropDowm(vo);
		return dropDowns;
	}
	/**
	 * 
	  * selectOperationByMenu(获取当前菜单后的操作集合)
	  *
	  * @Title: selectOperationByMenu
	  * @Description: TODO
	  * @param @param id
	  * @param @return    设定文件
	  * @return Object    返回类型
	  * @throws
	 */
	@RequestMapping("/operationByMenu")
	@ResponseBody
	public Object selectOperationByMenu(String id){
		return service.selectOperationByMenu(id);
	}
}
