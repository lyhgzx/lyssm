package com.liuyang.service.impl.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SyspersonMapper;
import com.liuyang.pojo.sys.Sysperson;
import com.liuyang.pojo.sys.SyspersonExample;
import com.liuyang.service.sys.SysPersonService;
import com.liuyang.utils.DigestUtil;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.SysPersonVo;
import com.liuyang.vo.sys.UserVo;
@Service
public class SysPersonServiceImpl implements SysPersonService {

	@Autowired
	SyspersonMapper mapper;
	
	@Override
	public int insert(Sysperson record) throws Exception {
		record.setId(ToolsUtil.getUUID());
		record.setCreatetime(new Date());
		record.setPassword(DigestUtil.md5Hex(record.getPassword()));
		record.setSurepassword(DigestUtil.md5Hex(record.getSurepassword()));
		return mapper.insert(record);
	}

	@Override
	public Sysperson getUser(String id) throws Exception {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public Sysperson getUserByName(String username) throws Exception {
	
		SyspersonExample example=new SyspersonExample();
		SyspersonExample.Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(username);
		 List<Sysperson> sList= mapper.selectByExample(example);
		 return sList.size() == 1 ? sList.get(0) : null;
	}

	@Override
	public void update(Sysperson user) throws Exception {
		
		mapper.updateByPrimaryKeySelective(user);
		
	}

	@Override
	public SysPersonVo getUserTable(SysPersonVo vo) throws Exception {
		SysPersonVo vo2=new SysPersonVo();
	      vo.setPageIndex((vo.getPageNumber()-1)*vo.getPageSize());
	   
	      vo2.setRows(mapper.selectTable(vo));
	      vo2.setTotal(mapper.getAllCount());
	      return vo2;
	}

	@Override
	public int delete(String ids) throws Exception {
		String[] iStrings=ids.split(",");
		
		return mapper.deleteByIds(iStrings);
	}

}
