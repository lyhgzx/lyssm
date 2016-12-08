package com.liuyang.service.impl.sys;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysroleDao;
import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.service.sys.SysRoleService;
import com.liuyang.utils.ShiroUtil;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.SysPersonVo;
import com.liuyang.vo.sys.SysroleVo;
@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	SysroleDao dao;
	@Override
	public Sysrole getById(String id) throws Exception {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Sysrole model) throws Exception {
		model.setId(ToolsUtil.getUUID());
		model.setCreatetime(new Date());
		model.setCreateperson(ShiroUtil.getSysUserName());
		return dao.insert(model);
	}

	@Override
	public void update(Sysrole model) throws Exception {
		
		dao.updateByPrimaryKeySelective(model);
		
	}

	@Override
	public int delete(String ids) throws Exception {
	String[] iStrings=ids.split(",");
		
		return dao.deleteByIds(iStrings);
	}

	@Override
	public SysroleVo getTable(SysroleVo vo) throws Exception {
		SysroleVo vo2=new SysroleVo();
	      vo.setPageIndex((vo.getPageNumber()-1)*vo.getPageSize());
	   
	      vo2.setRows(dao.selectTable(vo));
	      vo2.setTotal(dao.getAllCount());
	      return vo2;
	}

}
