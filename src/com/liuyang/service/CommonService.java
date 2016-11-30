package com.liuyang.service;

import java.util.List;

import com.liuyang.pojo.DropDown;
import com.liuyang.vo.DropDowmVo;

public interface CommonService {
	List<DropDown> getDropDowm(DropDowmVo vo);
}
