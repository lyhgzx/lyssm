package com.liuyang.vo.sys;

import java.util.Date;

import com.liuyang.vo.BootStrapTableVo;

public class SysLogVo extends BootStrapTableVo {
	
	private Date begTime;
	private Date endTime;

	public Date getBegTime() {
		return begTime;
	}

	public void setBegTime(Date begTime) {
		this.begTime = begTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
