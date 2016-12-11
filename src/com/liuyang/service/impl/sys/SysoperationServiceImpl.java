package com.liuyang.service.impl.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liuyang.dao.sys.SysoperationDao;
import com.liuyang.pojo.sys.Sysoperation;
import com.liuyang.pojo.sys.SysoperationExtend;
import com.liuyang.service.sys.SysoperationService;
import com.liuyang.utils.ShiroUtil;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.SysoperationVo;
@Service
public class SysoperationServiceImpl implements SysoperationService {

	@Autowired
	SysoperationDao dao;

	@Override
	public Sysoperation getById(String id) throws Exception {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Sysoperation model) throws Exception {
		model.setId(ToolsUtil.getUUID());
		model.setCreatetime(new Date());
		model.setCreateperson(ShiroUtil.getSysUserName());
		return dao.insert(model);
	}

	@Override
	public void update(Sysoperation model) throws Exception {
		dao.updateByPrimaryKeySelective(model);

	}

	@Override
	public int delete(String ids) throws Exception {
		String[] iStrings = ids.split(",");

		return dao.deleteByIds(iStrings);
	}

	@Override
	public SysoperationVo getTable(SysoperationVo vo) throws Exception {
		SysoperationVo vo2 = new SysoperationVo();
		PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
		List<SysoperationExtend> list = dao.selectTable(vo);
		vo2.setRows(dao.selectTable(vo));
		vo2.setTotal(((Page) list).getTotal());
		return vo2;
	}

}
