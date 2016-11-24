package com.liuyang.dao.sys;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuyang.pojo.sys.SysMenu;



public class SysMenuMapperTest {

	private SysMenuMapper dao;
	
	@Before
	public void setUp() throws Exception {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		dao=(SysMenuMapper)context.getBean("sysMenuMapper");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindMenuByRoleId() {
	      List<SysMenu> menus=dao.findMenuByRoleId("1");
	      System.out.print(menus.toString());
	}

}
