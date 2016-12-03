package com.liuyang.service.impl.sys;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.sys.SysfieldMapper;
import com.liuyang.pojo.sys.Sysfield;
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
		vo.setPageIndex((vo.getPageNumber() - 1) * vo.getPageSize());
		vo2.setRows(mapper.selectTable(vo));
		vo2.setTotal(mapper.getAllCount());
		return vo2;
	}

	@Override
	public int delete(String ids) throws Exception {
		String[] iStrings = ids.split(",");
		return mapper.deleteByIds(iStrings);
	}

}
