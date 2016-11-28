package com.liuyang.shiro;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import com.liuyang.utils.Config;



/**
 * 自定义权限认证
 * 

 */
public class ShiroAuthc extends AuthorizationFilter {

	/**
	 * 只检查登录验证，不检查权限验证的地址。
	 */
	private static Set<String> URIOK = new HashSet<String>();

	public void setURIOK(Set<String> uriok) {
		URIOK = uriok;
	}

	/**
	 * 登陆验证、权限验证
	 */
	@Override
	public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws IOException {
		// 登录验证
		if (!SecurityUtils.getSubject().isAuthenticated()) {
			return false;
		}

		// 权限验证
		String uri = getServletPath(request);
		/*String permitted = uri.replace("/".concat(Config.getAdminPath()), "");*/
		if (!(URIOK.contains(uri) || SecurityUtils.getSubject().isPermitted(uri))) {
			return false;
		}
		return true;
	}

	/**
	 * 获取请求地址(最多获取两个/地址，没有权限细化)
	 * 
	 * @param request
	 * @return
	 */
	private String getServletPath(ServletRequest request) {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String path = httpRequest.getServletPath();
	/*	String[] arr = path.split("/");
		if(arr.length>2){
			return new StringBuilder("/").append(arr[1]).append("/").append(arr[2]).toString();
		}*/
		return path;
	}
}
