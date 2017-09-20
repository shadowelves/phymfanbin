package com.phym.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.phym.entity.OutDoorScreen;

public class OutDoorTest {
	OutDoorScreenService service;
	
	@Before
	public void init() {
		String[] conf = {"conf/spring-mvc.xml","conf/spring-mybatis.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		service = ac.getBean("outDoorScreenService",OutDoorScreenService.class);
	}
	
	@Test
	public void test1() {
		 String userName = "";
		 List<OutDoorScreen> list = service.loadOutDoor(userName);
		 System.out.println(list);
	}
	@Test
	public void test2() {
		String outDoorId = "abdb81095eef46efb4792ecb363b4517";
		OutDoorScreen out = service.findOutDoorScreenById(outDoorId);
		System.out.println(out);
	}
	
	@Test
	public void test3() {
		
	}
	
	
	
}
