package com.liuyang.service.impl.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liuyang.dao.sys.SysmenuMapper;
import com.liuyang.pojo.sys.Sysmenu;
import com.liuyang.pojo.sys.SysmenuExample;
import com.liuyang.pojo.sys.SysmenuExtend;
import com.liuyang.service.sys.SysMenuService;
import com.liuyang.utils.ShiroUtil;
import com.liuyang.vo.sys.SysMenuVo;
import com.liuyang.vo.sys.SysMenuVo2;

@Service
public class MenuServiceImpl implements SysMenuService {

	@Autowired
	private SysmenuMapper dao;

	@Override
	public List<Sysmenu> selectMenuByUserID(String userID) {
		return dao.selectMenuByUserID(userID);
	}

	@Override
	public List<SysMenuVo> selectMenusTreeByUserID(String userID) {
		List<Sysmenu> menus = dao.selectMenuByUserID(userID);
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

	// 获取权限TreeListVo
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

	@Override
	public List<Sysmenu> getList() {
		SysmenuExample example = new SysmenuExample();
		SysmenuExample.Criteria criteria = example.createCriteria();
		 List<Sysmenu> list=dao.selectByExample(example);
		 //防止url有值后前段页面tree 点击弹出页面
		 for (Sysmenu sysmenu : list) {
			 sysmenu.setUrl("");
		}
		return list;
	}

	@Override
	public SysMenuVo2 GetSubOrgs(SysMenuVo2 vo) {
		SysMenuVo2 vo2 = new SysMenuVo2();
		PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
		List<SysmenuExtend> list = dao.selectTable(vo);
		vo2.setRows(list);
		vo2.setTotal(((Page) list).getTotal());
		return vo2;
	}

	@Override
	public Sysmenu getById(String id) throws Exception {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Sysmenu model) throws Exception {
		model.setId("0");
		ChangeModuleCascade(model);
		model.setCreatetime(new Date());
		model.setCreateperson(ShiroUtil.getSysUserName());
		if (model.getParentid() == null) {
			model.setParentid("0");
		}
		return dao.insert(model);
	}

	@Override
	public void update(Sysmenu model) throws Exception {
		ChangeModuleCascade(model);
		dao.updateByPrimaryKeySelective(model);

	}

	@Override
	public int delete(String ids) throws Exception {
		String[] iStrings = ids.split(",");
		return dao.deleteByIds(iStrings);
	}

	/**
	 * 修改对象的级联ID，生成类似XXX.XXX.X.XX
	 * 
	 * @param model
	 */
	private void ChangeModuleCascade(Sysmenu model) {
		String cascadeId = "";
		int currentCascadeId = 1; // 当前结点的级联节点最后一位
		model.setParentid(model.getParentid() == null ? "0" : model.getParentid());
		List<Sysmenu> sysdepartments = dao.selectMenuByParent(model);
		for (Sysmenu sysdepartment : sysdepartments) {
			String[] strArray = sysdepartment.getCascadeid().split("\\.");
			int objCascadeId = Integer.parseInt(strArray[strArray.length - 1]);
			if (currentCascadeId <= objCascadeId)
				currentCascadeId = objCascadeId + 1;

		}

		if (!model.getParentid().equals("0")) {
			Sysmenu parentOrg = dao.selectFirst(model);
			if (parentOrg != null) {
				cascadeId = parentOrg.getCascadeid() + "." + currentCascadeId;
				model.setParentname(parentOrg.getName());
			} else {

			}
		} else {
			cascadeId = "0." + currentCascadeId;

		}

		model.setCascadeid(cascadeId);
	}

}
