package com.phym.test;

import org.junit.Test;

import com.phym.dao.UserDao;
import com.phym.entity.User;

public class UserDaoTest extends TestBase{
	
	
	
	
	
	
	@Test
	public void test1() {
		UserDao dao = ac.getBean("userDao",UserDao.class);
		String name = "tom";
		User user = dao.findUserByName(name);
		System.out.println(user);
	}
	
	@Test
	public void test2() {
		UserDao dao = ac.getBean("userDao",UserDao.class);
		String phone = "18931991234";
		User user = dao.findUserByPhone(phone);
		System.out.println(user);
		String newPwd = "123456";
		if(user != null) {
			int i = dao.updatePassword(phone,newPwd);
			System.out.println(i);
		}
		user = dao.findUserByPhone(phone);
		System.out.println(user);
	}
	
	
	
}
