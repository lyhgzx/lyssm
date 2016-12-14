package com.liuyang.service.impl.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liuyang.dao.sys.SyslogDao;
import com.liuyang.dao.sys.SysloginhistoryDao;
import com.liuyang.pojo.sys.Syslog;
import com.liuyang.pojo.sys.SyslogExample;
import com.liuyang.pojo.sys.Sysloginhistory;
import com.liuyang.pojo.sys.SysloginhistoryExample;
import com.liuyang.service.sys.SysLogService;
import com.liuyang.vo.sys.SysLogVo;
@Service
public class SysLogServiceImpl implements SysLogService {
   
	@Autowired
	SyslogDao logDao;

	@Autowired
	SysloginhistoryDao loginLogDao;
	
	@Override
	public SysLogVo getLoginLog(SysLogVo vo) {
		SysloginhistoryExample example=new SysloginhistoryExample();
		SysloginhistoryExample.Criteria criteria=example.createCriteria();
		if(vo.getBegTime()!=null)
		criteria.andLogindateGreaterThanOrEqualTo(vo.getBegTime());
		if(vo.getEndTime()!=null)
			criteria.andLogindateLessThanOrEqualTo(vo.getEndTime());
		SysLogVo vo2 = new SysLogVo();
		PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
		List<Sysloginhistory> list = loginLogDao.selectByExample(example);
		vo2.setRows(list);
		vo2.setTotal(((Page) list).getTotal());
		return vo2;
	}

	@Override
	public SysLogVo getOperationLog(SysLogVo vo) {
		SyslogExample example=new SyslogExample();
		SyslogExample.Criteria criteria=example.createCriteria();
		if(vo.getBegTime()!=null)
			criteria.andDateGreaterThanOrEqualTo(vo.getBegTime());
			if(vo.getEndTime()!=null)
				criteria.andDateLessThanOrEqualTo(vo.getEndTime());
		SysLogVo vo2 = new SysLogVo();
		PageHelper.startPage(vo.getPageNumber(), vo.getPageSize());
		List<Syslog> list = logDao.selectByExample(example);
		vo2.setRows(list);
		vo2.setTotal(((Page) list).getTotal());
		return vo2;
	}

}
