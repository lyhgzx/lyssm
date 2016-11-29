package com.liuyang.service.sys;

import com.liuyang.pojo.sys.SysUser;
import com.liuyang.vo.sys.UserVo;

public interface UserService {
	
	SysUser getUser(String id);
	
	SysUser getUserByName(String username );
	
	void update(SysUser user);
	
	UserVo getUserTable(UserVo vo);
}
