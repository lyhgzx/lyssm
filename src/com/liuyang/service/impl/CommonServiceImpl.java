package com.liuyang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyang.dao.CommonMapper;
import com.liuyang.pojo.DropDown;
import com.liuyang.service.CommonService;
import com.liuyang.vo.DropDowmVo;
@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	CommonMapper mapper;
	@Override
	public List<DropDown> getDropDowm(DropDowmVo vo) {
		
		return mapper.getDropDowm(vo);
	}

}
