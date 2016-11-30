package com.liuyang.service.impl.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysUserMapper;
import com.liuyang.pojo.sys.SysUser;
import com.liuyang.pojo.sys.SysUserExample;
import com.liuyang.utils.DigestUtil;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.UserVo;

@Service
public class UserServiceImpl implements com.liuyang.service.sys.UserService {

	@Autowired
	SysUserMapper mapper;
 
	
	
	@Override
	public SysUser getUser(String id) {

		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public SysUser getUserByName(String username) {
		SysUserExample userExample = new SysUserExample();
		SysUserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<SysUser> usersList = mapper.selectByExample(userExample);
		return usersList.size() == 1 ? usersList.get(0) : null;
	}

	@Override
	public void update(SysUser user) {
		
		mapper.updateByPrimaryKeySelective(user);
		
	}

	@Override
	public UserVo getUserTable(UserVo vo) {
	      UserVo vo2=new UserVo();
	      vo.setPageIndex((vo.getPageNumber()-1)*vo.getPageSize());
	   
	      vo2.setRows(mapper.selectUsersTable(vo));
	      vo2.setTotal(mapper.getAllCount());
	      return vo2;
	}

	@Override
	public int insert(SysUser record) throws Exception {
		record.setId(ToolsUtil.getUUID());
		record.setCreatetime(new Date());
		record.setPassword(DigestUtil.md5Hex(record.getPassword()));
		return mapper.insert(record);
	}

}
