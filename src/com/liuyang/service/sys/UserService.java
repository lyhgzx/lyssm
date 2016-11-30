package com.liuyang.service.sys;

import com.liuyang.pojo.sys.SysUser;
import com.liuyang.vo.sys.UserVo;

public interface UserService {
	
	int insert(SysUser record) throws Exception;
	
	SysUser getUser(String id) throws Exception;;
	
	SysUser getUserByName(String username ) throws Exception;;
	
	void update(SysUser user) throws Exception;;
	
	UserVo getUserTable(UserVo vo) throws Exception;;
}
