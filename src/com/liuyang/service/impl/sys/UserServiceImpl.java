package com.liuyang.service.impl.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysUserMapper;
import com.liuyang.pojo.sys.SysUser;

@Service
public class UserServiceImpl implements com.liuyang.service.sys.UserService {

	@Autowired
	SysUserMapper dao;
	@Override
	public SysUser getUser(String id) {
		
		return dao.selectByPrimaryKey(id);
	}

}
