package com.liuyang.utils;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.liuyang.pojo.SessionConst;
import com.liuyang.service.sys.MenuService;
import com.liuyang.shiro.ShiroUser;
import com.liuyang.vo.sys.SysMenuVo;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * shiro用户工具类
 * @author liuyang
 *
 */
public class ShiroUtil {
	private static MenuService sysMenuBiz = SpringContextUtil.getBean(MenuService.class);
	/**
	 * 获取当前登录用户对象
	 * 
	 * @return 用户对象
	 */
	public static ShiroUser getSysUser() {
		return (ShiroUser) SecurityUtils.getSubject().getPrincipal();
	}
	
	/**
	 * 获取当前登录姓名
	 * 
	 * @return 用户对象
	 */
	public static String getSysUserName() {
		return getSysUser().getName();
	}

	
	
	/**
	 * 获取当前登录用户id
	 * 
	 * @return 用户id
	 */
	public static String getSysUserId() {
		return getSysUser().getId();
	}

	/**
	 * 获取当前用户菜单
	 * 
	 * @param comId
	 *            企业id
	 * @return
	 */
	public static String getSysMenus() {
		Object menus = ShiroUtil.getSessionKey(SessionConst.SYS_MENUS);
		if(menus == null){
			List<SysMenuVo> list = extracted(); 
			StringBuilder sbMenus=new StringBuilder();
			for (SysMenuVo menu1 : list) {
				List<SysMenuVo> menu2List=menu1.getSon();
				if(menu2List!=null){
					sbMenus.append("<li>");
					sbMenus.append("<a href='#'><i class='fa fa-flask'></i> <span class='nav-label'>"+menu1.getName()+"</span><span class='fa arrow'></span></a>");
					sbMenus.append("<ul class='nav nav-second-level'>");
					
					for (SysMenuVo menu2 : menu2List) {
						List<SysMenuVo> menu3List=menu2.getSon();
						if(menu3List!=null){
							sbMenus.append("<li>");
							sbMenus.append("<a href='#'>"+menu2.getName()+" <span class='fa arrow'></span></a>");
							sbMenus.append(" <ul class='nav nav-third-level'>");
							
							for (SysMenuVo menu3 : menu3List) {
								sbMenus.append(" <li><a class='J_menuItem' href='"+"/"+Config.getContextPath()+menu3.getUrl()+"'>"+menu3.getName()+"</a></li>");
							}
							sbMenus.append("</ul>");
							sbMenus.append("<li>");
						}else{
							sbMenus.append(" <li><a class='J_menuItem' href='"+"/"+Config.getContextPath()+menu2.getUrl()+"'>"+menu2.getName()+"</a></li>");
						}
					}
					sbMenus.append("</ul>");
					sbMenus.append("<li>");
					
				}else{
					sbMenus.append(" <li><a class='J_menuItem' href='"+"/"+Config.getContextPath()+menu1.getUrl()+"'>"+menu1.getName()+"</a></li>");
				}
				
			}
			
			menus = sbMenus.toString();
			ShiroUtil.setSessionKey(SessionConst.SYS_MENUS, menus);
		}
		return menus.toString();
	}

	private static List<SysMenuVo> extracted() {
		return sysMenuBiz.selectMenusTreeByUserID(getSysUserId());
	}

	
	/**
	 * 获取当前session
	 * 
	 * @return session对象
	 */
	public static Session getSession() {
		try {
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession(false);
			if (session == null) {
				session = subject.getSession();
			}
			if (session != null) {
				return session;
			}
		} catch (InvalidSessionException e) {
		}
		return null;
	}

	/**
	 * 获取session的值
	 * 
	 * @param key
	 *            需要获取的key
	 * @return session中获取的对象
	 */
	public static Object getSessionKey(SessionConst key) {
		return getSession().getAttribute(key.name());
	}

	/**
	 * 设置session的值
	 * 
	 * @param key
	 *            需要设置的key
	 * @return session中获取的对象
	 */
	public static void setSessionKey(SessionConst key, Object obj) {
		getSession().setAttribute(key.name(), obj);
	}

	/**
	 * 删除session的值
	 * 
	 * @param key
	 *            需要删除的key
	 * @return session中获取的对象
	 */
	public static void removeSessionKey(SessionConst key) {
		getSession().removeAttribute(key.name());
	}
}
