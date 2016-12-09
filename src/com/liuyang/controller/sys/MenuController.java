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
import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.service.sys.SysMenuService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.SysMenuVo2;


@Controller
@RequestMapping(value = "/admin/menu")
public class MenuController extends BaseController
{
	@Autowired
	private SysMenuService service;

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
	public Object save(Sysmenu model) throws Exception
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

		model.addAttribute("status", "add");
		return "sys/menuForm";
	}

	@RequestMapping("/updatePage")
	public String Update(Model model, String id) throws Exception
	{
		Sysmenu Sysmenu = service.getById(id);

		model.addAttribute("model", Sysmenu);
		model.addAttribute("status", "update");
		return "sys/menuForm";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(String ids) throws Exception
	{
		if (StringUtil.isNotBlank(ids))
		{
			service.delete(ids);
			return sendOk();
		} else
		{
			return sendError();
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
}
