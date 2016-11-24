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
	 * 获取当前角色名
	 * 
	 * @return 用户对象
	 */
	public static String getSysRoleName() {
		return getSysUser().getRoleName();
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
			menus = JsonUtil.toString(list);
			ShiroUtil.setSessionKey(SessionConst.SYS_MENUS, menus);
		}
		return menus.toString();
	}

	private static List<SysMenuVo> extracted() {
		return sysMenuBiz.findMenusByRoleId(ShiroUtil.getSysUser().getRoleId());
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
