package com.liuyang.service.impl.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysdepartmentMapper;
import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.pojo.sys.SysdepartmentExample;
import com.liuyang.pojo.sys.SysdepartmentExtend;
import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.service.sys.SysDepartmentService;
import com.liuyang.vo.sys.SysdepartmentVo;
import com.liuyang.vo.sys.SysfieldVo;

@Service
public class SysDepartmentServiceImpl  implements SysDepartmentService{
    @Autowired
    SysdepartmentMapper mapper;
    
    @Override
	public Sysdepartment getById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Sysdepartment model) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Sysdepartment model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(String ids) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Sysdepartment> getList() {
		SysdepartmentExample example=new SysdepartmentExample();
		SysdepartmentExample.Criteria criteria=example.createCriteria();
		return mapper.selectByExample(example);
	}

	@Override
	public SysdepartmentVo GetSubOrgs(SysdepartmentVo vo) {
		SysdepartmentVo vo2 = new SysdepartmentVo();
		vo.setPageIndex((vo.getPageNumber() - 1) * vo.getPageSize());
		vo2.setRows(mapper.selectTable(vo));
		vo2.setTotal(mapper.getAllCount());
		return vo2;
	}



	

}
