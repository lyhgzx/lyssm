package com.liuyang.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class CustomShiroMd5 extends AuthorizingRealm{

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		
		String usercodeString=arg0.getPrincipal().toString();
		
		String passwordString="c6a188f5f988ce2d998194287d46d87f";
		String salt="fdskjdsk";
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(usercodeString,passwordString,ByteSource.Util.bytes(salt), this.getName());
        return simpleAuthenticationInfo;
	}

}
