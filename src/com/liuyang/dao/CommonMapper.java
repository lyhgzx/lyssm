package com.liuyang.dao;

import com.liuyang.pojo.DropDown;
import com.liuyang.pojo.sys.SysUser;
import com.liuyang.pojo.sys.SysUserExample;
import com.liuyang.pojo.sys.SysUserExtend;
import com.liuyang.vo.DropDowmVo;
import com.liuyang.vo.sys.UserVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonMapper {
	/*
	 * 通用下拉框
	 */
    List<DropDown> getDropDowm(DropDowmVo vo);
}