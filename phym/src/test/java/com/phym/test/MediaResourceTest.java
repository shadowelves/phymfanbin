package com.phym.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;

import com.phym.dao.OutDoorScreenDao;
import com.phym.entity.OutDoorScreen;
import com.phym.util.NoteUtil;

public class MediaResourceTest extends TestBase{
	//插入户外大屏
	@Test
	public void test1(){
		OutDoorScreenDao dao = ac.getBean("outDoorScreenDao",OutDoorScreenDao.class);
		OutDoorScreen outDoor = new OutDoorScreen();
		outDoor.setOutdoor_screen_id(NoteUtil.createId());
		outDoor.setOutdoor_screen_name("2这里有广告2");
		outDoor.setOutdoor_screen_province("110000");
		outDoor.setOutdoor_screen_city("110100");
		outDoor.setOutdoor_screen_country("110104");
		outDoor.setOutdoor_screen_address("第一大街与大路交叉口2");
		outDoor.setOutdoor_screen_mediasourceType("非合约");
		outDoor.setOutdoor_screen_screenType("横屏");
		outDoor.setOutdoor_screen_screenSize("300");
		outDoor.setOutdoor_screen_resolutionRatio_length("1280");
		outDoor.setOutdoor_screen_resolutionRatio_height("600");
		outDoor.setOutdoor_screen_playStartTime("7");
		outDoor.setOutdoor_screen_playEndTime("20");
		outDoor.setOutdoor_screen_userName("tom");
		outDoor.setOutdoor_screen_status(0);
		outDoor.setOutdoor_screen_checkStatus(1);
		outDoor.setOutdoor_screen_photoPath("D:/435.jpg");
		outDoor.setOutdoor_screen_superiority("我的广告，我做主");
		outDoor.setOutdoor_screen_aptitude("ID444555544133");
		Timestamp time = new Timestamp(System.currentTimeMillis());
		outDoor.setOutdoor_screen_createdDate(time);
		outDoor.setOutdoor_screen_remark("美女优惠");
		outDoor.setOutdoor_screen_frequency("60");
		outDoor.setOutdoor_screen_playbackPeriod("12");
		int n = dao.insertOutDoor(outDoor);
		
		System.out.println(n);
	}
	
	@Test
	public void test2() {
		OutDoorScreenDao outDoor = ac.getBean("outDoorScreenDao",OutDoorScreenDao.class);
		int i = outDoor.deleteOutDoor("c1cc0fc90e654f4d948d9ba3db0ce664");
		System.out.println(i);
	}
	
	@Test
	public void test3() {
		OutDoorScreenDao outDoor = ac.getBean("outDoorScreenDao",OutDoorScreenDao.class);
		List<OutDoorScreen> list = outDoor.loadOutDoor("lucy");
		System.out.println(list);
	
	}
	
	@Test
	public void test4() {
		OutDoorScreenDao outDoor = ac.getBean("outDoorScreenDao",OutDoorScreenDao.class);
		OutDoorScreen  doorScreen = outDoor.findOutDoorScreenById("7228384079a24ad6a05af6f501a1c164");
		String outName = doorScreen.getOutdoor_screen_name();
		System.out.println(outName);
		
		OutDoorScreen out = new OutDoorScreen();
		out.setOutdoor_screen_id("7228384079a24ad6a05af6f501a1c164");
		out.setOutdoor_screen_name("横说竖说23456");
		out.setOutdoor_screen_modifyDate(new Timestamp(System.currentTimeMillis()));
		int i = outDoor.modifyOutDoor(out);
		System.out.println(i);
	}
	
	
}
