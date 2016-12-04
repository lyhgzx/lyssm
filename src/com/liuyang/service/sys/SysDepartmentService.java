package com.liuyang.service.sys;

import java.util.List;

import com.liuyang.pojo.sys.Sysdepartment;
import com.liuyang.pojo.sys.Sysfield;
import com.liuyang.service.BaseService;

public interface SysDepartmentService extends BaseService<Sysfield> {
  
	List<Sysdepartment> getList();
}
