package com.liuyang.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.liuyang.dao.sys.SysMenuMapper;
import com.liuyang.dao.sys.SysUserMapper;
import com.liuyang.pojo.sys.SysUser;



public class ShiroRealm extends AuthorizingRealm {
	private static Logger logger = LoggerFactory.getLogger(ShiroRealm.class);
	
	@Autowired
	private SysUserMapper userMapper;
	@Autowired
	private SysMenuMapper menuMapper;
	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		logger.debug("开始登录认证");
		UsernamePasswordToken token=(UsernamePasswordToken)arg0;
		SysUser user=userMapper.selectByName(token.getUsername());
		return null;
	}
	
	/**
	 * 授权认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
