package com.liuyang.vo.sys;

import java.util.List;

import com.liuyang.pojo.sys.SysMenu;

/**
 * 菜单vo
 * @author liuyang
 *
 */
public class SysMenuVo extends SysMenu {
	
	private List<SysMenuVo> son;

	public List<SysMenuVo> getSon() {
		return son;
	}

	public void setSon(List<SysMenuVo> son) {
		this.son = son;
	}
	
}