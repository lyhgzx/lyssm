package com.liuyang.service.impl.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liuyang.dao.sys.SysfieldMapper;
import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.pojo.sys.SysfieldExtend;
import com.liuyang.service.sys.SysFieldService;
import com.liuyang.utils.ToolsUtil;
import com.liuyang.vo.sys.SysfieldVo;

@Service
public class SysFieldServiceImpl implements SysFieldService {

	@Autowired
	SysfieldMapper mapper;

	@Override
	public int insert(Sysfield model) throws Exception {
		model.setId(ToolsUtil.getUUID());
		model.setCreatetime(new Date());

		return mapper.insert(model);
	}

	@Override
	public Sysfield getById(String id) throws Exception {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(Sysfield model) throws Exception {
		mapper.updateByPrimaryKeySelective(model);

	}

	@Override
	public SysfieldVo getTable(SysfieldVo vo) throws Exception {
		SysfieldVo vo2 = new SysfieldVo();
		   PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
		   List<SysfieldExtend> list=mapper.selectTable(vo);
		vo2.setRows(list);
		vo2.setTotal(((Page)list).getTotal());
		return vo2;
	}

	@Override
	public int delete(String ids) throws Exception {
		String[] iStrings = ids.split(",");
		return mapper.deleteByIds(iStrings);
	}

}
