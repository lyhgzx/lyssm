package com.liuyang.dao;

import java.util.List;

import com.liuyang.pojo.DropDown;
import com.liuyang.vo.DropDowmVo;

public interface CommonMapper {
	/*
	 * 通用下拉框
	 */
    List<DropDown> getDropDowm(DropDowmVo vo);
}