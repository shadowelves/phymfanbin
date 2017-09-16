package com.phym.test;

import java.sql.Timestamp;

import org.junit.Test;

import com.phym.dao.MediaResourceDao;
import com.phym.entity.OutDoor_Screen;
import com.phym.util.NoteUtil;

public class MediaResourceTest extends TestBase{
	//插入户外大屏
	@Test
	public void test1(){
		MediaResourceDao dao = ac.getBean("mediaResourceDao",MediaResourceDao.class);
		OutDoor_Screen outDoor = new OutDoor_Screen();
		outDoor.setOutdoor_screen_id(NoteUtil.createId());
		outDoor.setOutdoor_screen_name("这里有广告");
		outDoor.setOutdoor_screen_province("110000");
		outDoor.setOutdoor_screen_city("110100");
		outDoor.setOutdoor_screen_country("110102");
		outDoor.setOutdoor_screen_address("第一大街与大路交叉口");
		outDoor.setOutdoor_screen_mediasourceType("非合约");
		outDoor.setOutdoor_screen_screenType("横屏");
		outDoor.setOutdoor_screen_resolutionRatio_length(1280);
		outDoor.setOutdoor_screen_resolutionRatio_heigth(600);
		outDoor.setOutdoor_screen_playStartTime(7);
		outDoor.setOutdoor_screen_playEndTime(20);
		outDoor.setOutdoor_screen_userName("tom");
		outDoor.setOutdoor_screen_status(0);
		outDoor.setOutdoor_screen_checkStatus(1);
		outDoor.setOutdoor_screen_photoPath("D:/435.jpg");
		outDoor.setOutdoor_screen_superiority("我的广告，我做主");
		outDoor.setOutdoor_screen_aptitude("ID444555544");
		Timestamp time = new Timestamp(System.currentTimeMillis());
		outDoor.setOutdoor_screen_createdDate(time);
		outDoor.setOutdoor_screen_remark("美女优惠");
		outDoor.setOutdoor_screen_frequency(60);
		outDoor.setOutdoor_screen_playbackPeriod(12);
		int n = dao.insertOutDoor(outDoor);
		
		System.out.println(n);
	}
}
