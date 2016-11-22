package com.liuyang.service.sys;

import com.liuyang.pojo.sys.SysUser;

public interface UserService {
	
	SysUser getUser(String id);
	
	SysUser getUserByName(String username );
	
	void update(SysUser user);
	

}
