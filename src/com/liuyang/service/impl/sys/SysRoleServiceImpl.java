package com.liuyang.service.impl.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liuyang.dao.sys.SysroleDao;
import com.liuyang.dao.sys.SysrolesyspersonDao;
import com.liuyang.pojo.sys.Sysrole;
import com.liuyang.pojo.sys.SysroleExtend;
import com.liuyang.pojo.sys.Sysrolesysperson;
import com.liuyang.pojo.sys.SysrolesyspersonExample;
import com.liuyang.service.sys.SysRoleService;
import com.liuyang.utils.ShiroUtil;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.SysroleVo;
import com.liuyang.vo.sys.SysrolesyspersonVo;
@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	SysroleDao dao;
	@Autowired 
	SysrolesyspersonDao rolepersonDao;
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
	    PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
	   List<SysroleExtend> list=dao.selectTable(vo);
	      vo2.setRows(dao.selectTable(vo));
	      vo2.setTotal(((Page) list).getTotal());
	      return vo2;
	}

	@Override
	public SysroleVo getRoleByPerson(SysroleVo vo) throws Exception {
		SysroleVo vo2=new SysroleVo();
		  PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
	     List<SysroleExtend> list=dao.selectTable(vo);
	     vo2.setTotal(((Page) list).getTotal());
	     for (SysroleExtend sysroleExtend : list) {
	    	 SysrolesyspersonExample example=new SysrolesyspersonExample();
	    	 SysrolesyspersonExample.Criteria criteria=example.createCriteria();
	    	 criteria.andSyspersonidEqualTo(vo.getPersonid());
	    	 criteria.andSysroleidEqualTo(sysroleExtend.getId());
	    	 if(rolepersonDao.countByExample(example)>0){
	    		 sysroleExtend.setAuthor("已授权");
	    	 }else{
	    		 sysroleExtend.setAuthor("未授权");
	    	 }
		}
	      vo2.setRows(list);
	 
	      return vo2;
	}

	@Override
	public void authorPersonRole(SysrolesyspersonVo vo) throws Exception {
		
		if(vo.getAction().equalsIgnoreCase("author")){
			SysrolesyspersonExample example =new SysrolesyspersonExample();
			SysrolesyspersonExample.Criteria criteria=example.createCriteria();
			criteria.andSyspersonidEqualTo(vo.getPersonid());
			criteria.andSysroleidEqualTo(vo.getRoleid());
			if(rolepersonDao.countByExample(example)==0){
				Sysrolesysperson model=new Sysrolesysperson();
				model.setSysroleid(vo.getRoleid());
				model.setSyspersonid(vo.getPersonid());
				rolepersonDao.insert(model);
			}
		}else{
			rolepersonDao.deleteByPrimaryKey(vo.getPersonid(), vo.getRoleid());
		}
		
	}

}
