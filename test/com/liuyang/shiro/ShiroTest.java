package com.liuyang.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

public class ShiroTest {

	@Test
	public void testLogin() {
		
		// 创建securityManager工厂，通过ini配置文件创建securityManager工厂
		Factory<SecurityManager>  factory=new IniSecurityManagerFactory("classpath:shiro.ini");
		//创建SecurityManager
		SecurityManager securityManager=factory.getInstance();
		//将securityManager设置当前的运行环境中
		SecurityUtils.setSecurityManager(securityManager);
		//从SecurityUtils里边创建一个subject
		Subject subject = SecurityUtils.getSubject();
		//在认证提交前准备token（令牌）
		UsernamePasswordToken token = new UsernamePasswordToken("admin", "888888");
		
		try {
			//执行认证提交
			subject.login(token);
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//是否认证通过
		boolean isAuthenticated =  subject.isAuthenticated();
		
		System.out.println("是否认证通过：" + isAuthenticated);
		
		//退出操作
		subject.logout();
		
		//是否认证通过
		isAuthenticated =  subject.isAuthenticated();
		
		System.out.println("是否认证通过：" + isAuthenticated);


	}
	
	@Test
	public void testHash(){
		
		String source="888888";
		String salt="fdskjdsk";
		int hastNum=2;
		Md5Hash md5Hash=new Md5Hash(source,salt,hastNum);
		System.out.println(md5Hash.toString());
		
		
		SimpleHash simpleHash=new SimpleHash("md5",source,salt,hastNum);
		System.out.println(simpleHash.toString());
	}
	@Test
	public void testCustomRealm(){
		
		    // 创建securityManager工厂，通过ini配置文件创建securityManager工厂
				Factory<SecurityManager>  factory=new IniSecurityManagerFactory("classpath:shiro-realm-md5.ini");
				//创建SecurityManager
				SecurityManager securityManager=factory.getInstance();
				//将securityManager设置当前的运行环境中
				SecurityUtils.setSecurityManager(securityManager);
				//从SecurityUtils里边创建一个subject
				Subject subject = SecurityUtils.getSubject();
		
				//在认证提交前准备token（令牌）
				UsernamePasswordToken token = new UsernamePasswordToken("admin", "888888");
				
				try {
					//执行认证提交
					subject.login(token);
				} catch (AuthenticationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//是否认证通过
				boolean isAuthenticated =  subject.isAuthenticated();
				
				System.out.println("是否认证通过：" + isAuthenticated);
				
				//退出操作
				subject.logout();
				
				//是否认证通过
				isAuthenticated =  subject.isAuthenticated();
				
				System.out.println("是否认证通过：" + isAuthenticated);
	}
}
