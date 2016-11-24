package com.liuyang.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.liuyang.dao.sys.SysMenuMapper;
import com.liuyang.dao.sys.SysUserMapper;
import com.liuyang.pojo.sys.SysMenu;
import com.liuyang.pojo.sys.SysUser;
import com.liuyang.pojo.sys.SysUserExtend;



public class ShiroRealm extends AuthorizingRealm {
	private static Logger logger = LoggerFactory.getLogger(ShiroRealm.class);
	
	@Autowired
	private SysUserMapper userDao;
	@Autowired
	private SysMenuMapper menuDao;
	
	
	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		logger.debug("开始登录认证");
		UsernamePasswordToken token=(UsernamePasswordToken)arg0;
		SysUserExtend user=userDao.selectByName(token.getUsername());
		// 账号不存在
				if (user == null) {
					return null;
				}
				// 账号已禁用
				if (user.getStatus() == 0) {
					return null;
				}
				ShiroUser shiroUser = new ShiroUser(user.getId(), user.getUsername(), user.getName(), user.getRoleid(),user.getRoleName());
				// 认证缓存信息
				return new SimpleAuthenticationInfo(shiroUser, user.getPassword().toCharArray(), getName());
	}
	
	/**
	 * 授权认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		logger.debug("开始授权认证");
		ShiroUser shiroUser = (ShiroUser) arg0.getPrimaryPrincipal();
		String roleId = shiroUser.getRoleId();
		List<SysMenu> roleMenuList=menuDao.findMenuByRoleId(roleId);
		Set<String> urlSet = new HashSet<String>();
		for (SysMenu menu : roleMenuList) {
			if (StringUtils.isNoneBlank(menu.getUrl())) {
				urlSet.add(menu.getUrl());
			}
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addStringPermissions(urlSet);
		return info;
	}

	

}
