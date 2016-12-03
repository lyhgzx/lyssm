package com.liuyang.service;

/**
 * 基础服务接口
 * @author Administrator
 *
 * @param <T>
 */
public interface BaseService<T> {
	//单表查询
	T getById(String id) throws Exception;
	//插入
	int insert(T model) throws Exception;
	//修改
	void update(T model) throws Exception;
    //删除
	int delete(String ids) throws Exception;
}
