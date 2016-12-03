package com.liuyang.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuyang.controller.base.BaseController;
import com.liuyang.pojo.sys.Sysperson;
import com.liuyang.service.sys.SysPersonService;
import com.liuyang.utils.StringUtil;
import com.liuyang.vo.sys.SysPersonVo;

@Controller
@RequestMapping(value = "/admin/person")
public class PersonController extends BaseController {

	@Autowired
	private SysPersonService service;

	@RequestMapping("")
	public String showTable() {
		logger.info("用户管理");
		return "/sys/personList";
	}

	@RequestMapping(value = "/findtable", method = RequestMethod.POST)
	@ResponseBody
	public Object getTable(HttpServletRequest request, SysPersonVo vo) throws Exception {

		SysPersonVo viewModel = service.getTable(vo);
		return viewModel;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Object save(Sysperson person) throws Exception {
		if (StringUtil.isBlank(person.getId())) {
			logger.debug("增加用户");
			service.insert(person);
		} else {
			logger.debug("修改用户");
			service.update(person);
		}

		return sendOk();
	}

	@RequestMapping("/addPage")
	public String personAdd(Model model) {
		model.addAttribute("status", "add");
		return "sys/personForm";
	}

	@RequestMapping("/updatePage")
	public String personUpdate(Model model, String id) throws Exception {
		Sysperson person = service.getById(id);
		model.addAttribute("person", person);
		model.addAttribute("status", "update");
		return "sys/personForm";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(String ids) throws Exception {
		if (StringUtil.isNotBlank(ids)) {
			service.delete(ids);
			return sendOk();
		} else {
			return sendError();
		}

	}

}
