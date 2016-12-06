package com.liuyang.service.sys;

import java.util.List;

import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.service.BaseService;
import com.liuyang.vo.sys.SysdepartmentVo;

public interface SysDepartmentService extends BaseService<Sysdepartment> {
  
	List<Sysdepartment> getList();
	SysdepartmentVo GetSubOrgs(SysdepartmentVo vo);
}
