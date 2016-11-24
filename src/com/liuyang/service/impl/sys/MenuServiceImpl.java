package com.liuyang.service.impl.sys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.liuyang.dao.sys.SysMenuMapper;
import com.liuyang.pojo.sys.SysMenu;
import com.liuyang.service.sys.MenuService;
import com.liuyang.vo.sys.SysMenuVo;
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private SysMenuMapper dao;
	
	@Override
	public List<SysMenu> findMenuByRoleId(String roleId) {
		
		return dao.findMenuByRoleId(roleId);
	}

	@Override
	public List<SysMenuVo> findMenusByRoleId(String roleId) {
		// 查询角色菜单
		List<SysMenu> menus = dao.findMenuByRoleId(roleId);
		return getMenusVo(menus, "0");
	}
	
	// 获取权限TreeListMap
		private List<Map<String, Object>> getMenusMap(List<Map<String, Object>> menus, String id) {
			List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
			for (Map<String, Object> row : menus) {
				String rowid = row.get("id").toString();
				String rowpid = row.get("pid").toString();
				if (id.equals(rowpid)) {
					List<Map<String, Object>> list = getMenusMap(menus, rowid);
					if (list.size() > 0) {
						row.put("son", list);
					}
					result.add(row);
				}
			}
			return result;
		}

		//获取权限TreeListVo
		private List<SysMenuVo> getMenusVo(List<SysMenu> menus, String id) {
			List<SysMenuVo> result = new ArrayList<SysMenuVo>();
			for (SysMenu row : menus) {
				String rowid = row.getId();
				String rowpid = row.getPid();
				if (id.equals(rowpid)) {
					SysMenuVo vo = row.toVo();
					List<SysMenuVo> list = getMenusVo(menus, rowid);
					if (list.size() > 0) {
						vo.setSon(list);
					}
					result.add(vo);
				}
			}
			return result;
		}

}
