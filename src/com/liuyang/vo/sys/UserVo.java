package com.liuyang.vo.sys;


public class UserVo  {
	
	private String username;
	private  String name;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 页面大小
	 */
	private int PageSize;
	/**
	 * 表示在mysql中从第几条记录的索引号开始显示，索引从0开始
	 */
	private int PageIndex;
	/**
	 * 页面索引
	 */
	private int PageNumber;
	
	/**
	 * 排序
	 */
	private String OrderBy;
	/**
	 * 总数
	 */
	private int total;
	/*
	 * 记录
	 */
	private Object rows;
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public int getPageIndex() {
		return PageIndex;
	}
	public void setPageIndex(int pageIndex) {
		PageIndex = pageIndex;
	}
	public int getPageNumber() {
		return PageNumber;
	}
	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}
	public String getOrderBy() {
		return OrderBy;
	}
	public void setOrderBy(String orderBy) {
		OrderBy = orderBy;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}
	
	
	

 
}
