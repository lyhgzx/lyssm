package com.liuyang.vo;

/**
 * 分页对象
 * 
 */
public class PageVo {

	private int page;
	private int rows;
	private int total;
	private int count;
	private int prev;
	private int next;
	private boolean isprev;
	private boolean isnext;
	private String url;
	private Object list;

	public PageVo() {
	}

	public PageVo(int page, int rows, int total, Object list) {
		this.page = page;
		this.rows = rows;
		this.total = total;
		this.list = list;
	}

	public int getPage() {
		page = page < getCount() ? page : getCount();
		page = page < 1 ? 1 : page;
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCount() {
		if (rows == 0)
			return 0;
		count = total / rows;
		if (total % rows != 0)
			count++;
		count = count == 0 ? 1 : count;
		return count;
	}

	public int getPrev() {
		prev = getPage() - 1;
		prev = prev < 1 ? 1 : prev;
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		next = getPage() + 1;
		next = next > getCount() ? getCount() : next;
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public boolean isIsprev() {
		isprev = false;
		if ((getCount() > 1) && (page > 1))
			isprev = true;
		return isprev;
	}

	public void setIsprev(boolean isprev) {
		this.isprev = isprev;
	}

	public boolean isIsnext() {
		isnext = false;
		if ((getCount() > 1) && (getCount() > getPage()))
			isnext = true;
		return isnext;
	}

	public void setIsnext(boolean isnext) {
		this.isnext = isnext;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Object getList() {
		return list;
	}

	public void setList(Object list) {
		this.list = list;
	}

	public String getPreurl() {
		if (url != null) {
			return url.concat("/") + getPrev();
		}
		return null;
	}

	public String getNexturl() {
		if (url != null) {
			return url.concat("/") + getNext();
		}
		return null;
	}
}
