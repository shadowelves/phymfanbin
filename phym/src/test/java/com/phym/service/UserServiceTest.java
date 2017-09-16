package com.phym.service;

import org.junit.Test;

import com.phym.entity.User;

public class UserServiceTest extends TestBase{

	@Test
	public void test1() {
		
		String name = "tom";
		String password = "123456";
		
		User user = service.GGlogin(name, password);
		System.out.println(user);
	}

}
