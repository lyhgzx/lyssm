package com.liuyang.dao.sys;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuyang.pojo.sys.SysUser;

public class SysUserMapperTest {

	private SysUserMapper dao;
	
	@Before
	public void setUp() throws Exception {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		dao=(SysUserMapper)context.getBean("sysUserMapper");
	}

	@Test
	public void testSelectByPrimaryKey() {
		SysUser user=dao.selectByPrimaryKey("1");
		System.out.print(user.toString());
	}

}
