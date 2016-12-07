package com.liuyang.service.impl.sys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysmenuMapper;
import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.service.sys.MenuService;
import com.liuyang.vo.sys.SysMenuVo;
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private SysmenuMapper dao;

	@Override
	public List<Sysmenu> selectMenuByUserID(String userID) {
		return dao.selectMenuByUserID(userID);
	}

	@Override
	public List<SysMenuVo> selectMenusTreeByUserID(String userID) {
		List<Sysmenu> menus =dao.selectMenuByUserID(userID);
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
		private List<SysMenuVo> getMenusVo(List<Sysmenu> menus, String id) {
			List<SysMenuVo> result = new ArrayList<SysMenuVo>();
			for (Sysmenu row : menus) {
				String rowid = row.getId();
				String rowpid = row.getParentid();
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
