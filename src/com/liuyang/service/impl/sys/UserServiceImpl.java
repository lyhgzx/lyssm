package com.liuyang.service.impl.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysUserMapper;
import com.liuyang.pojo.sys.SysUser;
import com.liuyang.pojo.sys.SysUserExample;

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

}
