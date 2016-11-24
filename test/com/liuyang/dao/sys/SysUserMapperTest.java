package com.liuyang.dao.sys;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.liuyang.pojo.sys.SysUser;
import com.liuyang.pojo.sys.SysUserExample;

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

	@Test
	public void testSelectByName() {
		/*SysUser user=dao.selectByName("admin");
		System.out.print(user.toString());*/
		
		SysUserExample userExample=new SysUserExample();
	    SysUserExample.Criteria criteria=userExample.createCriteria();
	    criteria.andUsernameEqualTo("admin");
	   java.util.List<SysUser> usersList= dao.selectByExample(userExample);
	   System.out.print(usersList.size());
	  
	}

	
}
