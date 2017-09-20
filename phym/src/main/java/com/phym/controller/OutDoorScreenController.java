package com.phym.controller;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phym.entity.OutDoorScreen;
import com.phym.service.OutDoorScreenService;
import com.phym.util.JsonResult;
import com.phym.util.NoteUtil;

@RestController
@RequestMapping("/media")
public class OutDoorScreenController extends BaseController{
	
	@Autowired
	private OutDoorScreenService outDoorScreenService;
	
	//媒体资源上传
	@RequestMapping("/outdoor.do")
	public JsonResult<Boolean> uploadResource(String mediaName,String province,String city,String country,String address,String mediaType,String screenType,String screenSize,String length,String height,String startTime,String endTime,String userName,String photo,String superiority,String aptitude,String remark,String playback){
		OutDoorScreen outDoor = new OutDoorScreen();
		outDoor.setOutdoor_screen_id(NoteUtil.createId());
		outDoor.setOutdoor_screen_name(mediaName);
		outDoor.setOutdoor_screen_province(province);
		outDoor.setOutdoor_screen_city(city);
		outDoor.setOutdoor_screen_country(country);
		outDoor.setOutdoor_screen_address(address);
		outDoor.setOutdoor_screen_mediasourceType(mediaType);
		outDoor.setOutdoor_screen_screenType(screenType);
		outDoor.setOutdoor_screen_screenSize(screenSize);
		outDoor.setOutdoor_screen_resolutionRatio_length(length);
		outDoor.setOutdoor_screen_resolutionRatio_height(height);
		outDoor.setOutdoor_screen_playStartTime(startTime);
		outDoor.setOutdoor_screen_playEndTime(endTime);
		outDoor.setOutdoor_screen_userName(userName);
		outDoor.setOutdoor_screen_status(0);
		outDoor.setOutdoor_screen_checkStatus(0);
		outDoor.setOutdoor_screen_photoPath(photo);
		outDoor.setOutdoor_screen_superiority(superiority);
		outDoor.setOutdoor_screen_aptitude(aptitude);
		Timestamp time = new Timestamp(System.currentTimeMillis());
		outDoor.setOutdoor_screen_createdDate(time);
		outDoor.setOutdoor_screen_remark(remark);
		outDoor.setOutdoor_screen_playbackPeriod(playback);
		int num = Integer.parseInt(endTime) - Integer.parseInt(startTime);		
		outDoor.setOutdoor_screen_frequency((num*60)/Integer.parseInt(playback)+"");
		
		Boolean bool = outDoorScreenService.uploadResource(outDoor);
		
		return new JsonResult<Boolean>(bool);
	}
	//管理媒体资源
	@RequestMapping("/loadout.do")
	public JsonResult<List<OutDoorScreen>> loadOutDoor(String userName){
		List<OutDoorScreen> list = outDoorScreenService.loadOutDoor(userName);
		return new JsonResult<List<OutDoorScreen>>(list);
	}
	//删除媒体资源
	@RequestMapping("/delout.do")
	public JsonResult<Boolean> deleteOutDoor(String outDoorId){
		Boolean bool = outDoorScreenService.deleteMediaResource(outDoorId);
		return new JsonResult<Boolean>(bool);
	}
	//通过id查找媒体资源
	@RequestMapping("/findout.do")
	public JsonResult<OutDoorScreen> findOutDoorScreenById(String outDoorId){
		OutDoorScreen doorScreen = outDoorScreenService.findOutDoorScreenById(outDoorId);
		return new JsonResult<OutDoorScreen>(doorScreen);
	}
	//修改媒体资源
	@RequestMapping("/modifyout.do")
	public JsonResult<Boolean> modifyOutDoor(OutDoorScreen outDoor){
		Boolean bool = outDoorScreenService.modifyOutDoor(outDoor);
		return new JsonResult<Boolean>(bool);
	}
	
	
}
