package com.phym.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phym.dao.OutDoorScreenDao;
import com.phym.entity.OutDoorScreen;
import com.phym.exception.OutDoorScreenException;

@Service("outDoorScreenService")
public class OutDoorScreenServiceImpl implements OutDoorScreenService {
	
	@Autowired
	private OutDoorScreenDao outDoorDao;
	//上传媒体资源
	public Boolean uploadResource(OutDoorScreen outDoor) throws OutDoorScreenException{
		if(outDoor == null) {
			return false;
		}
		
		if(outDoor.getOutdoor_screen_name()==null) {
			throw new OutDoorScreenException("必填选项");
		}
		String reg1 = "^[一-龥a-zA-Z][一-龥a-zA-Z0-9_]*$";
		if(outDoor.getOutdoor_screen_name().length()>=30 || !outDoor.getOutdoor_screen_name().matches(reg1)) {
			throw new OutDoorScreenException("3-20位，中文、字母、数字、下划线的组合，以中文或字母开头");
		}
		if(outDoor.getOutdoor_screen_province()==null) {
			throw new OutDoorScreenException("请选择省");
		}
		if(outDoor.getOutdoor_screen_city()==null) {
			throw new OutDoorScreenException("请选择市");
		}
		if(outDoor.getOutdoor_screen_country()==null) {
			throw new OutDoorScreenException("请选择区/县");
		}
		if(outDoor.getOutdoor_screen_address()==null) {
			throw new OutDoorScreenException("请填写大屏地址");
		}
		if(outDoor.getOutdoor_screen_address().length()>=100) {
			throw new OutDoorScreenException("输入文本过长");
		}
		if(outDoor.getOutdoor_screen_mediasourceType()==null) {
			throw new OutDoorScreenException("请选择资源类型");
		}
		if(outDoor.getOutdoor_screen_screenSize()==null) {
			throw new OutDoorScreenException("请输入内容");
		}
		String reg4 = "^[1-9]\\d{2,4}";
		if(outDoor.getOutdoor_screen_screenSize().matches(reg4)) {
			throw new OutDoorScreenException("请输入3-5位有效数字，第一位不能为0");
		}
		
		String reg2 = "^[1-9]\\d{2,9}";
		String str = outDoor.getOutdoor_screen_resolutionRatio_length();
		String sts = outDoor.getOutdoor_screen_resolutionRatio_height();
		if(str.equals("") ||sts.equals("")) {
			throw new OutDoorScreenException("请填写内容");
		}
		
		if(str.matches(reg2) || sts.matches(reg2)) {
			throw new OutDoorScreenException("请输入3-10有效数字，第一位不能为0");
		}
		if(outDoor.getOutdoor_screen_playStartTime()==null || outDoor.getOutdoor_screen_playEndTime()==null) {
			throw new OutDoorScreenException("请选择播放时间");
		}
		if(outDoor.getOutdoor_screen_superiority() == null) {
			throw new OutDoorScreenException("请填写内容");
		}
		if(outDoor.getOutdoor_screen_superiority().length()>=150) {
			throw new OutDoorScreenException("输入文本过长");
		}
		if(outDoor.getOutdoor_screen_aptitude()==null) {
			throw new OutDoorScreenException("请选择资质文件");
		}
		if(outDoor.getOutdoor_screen_remark()==null) {
			throw new OutDoorScreenException("请填写内容");
		}
		if(outDoor.getOutdoor_screen_remark().length()>=40) {
			throw new OutDoorScreenException("输入文本过长");
		}
		if(outDoor.getOutdoor_screen_playbackPeriod()==null) {
			throw new OutDoorScreenException("请输入内容");
		}
		String reg3 = "^[1-9]\\d{0,3}";		
		if(outDoor.getOutdoor_screen_playbackPeriod().matches(reg3)) {
			throw new OutDoorScreenException("请输入1-3位有效数字，第一位不能为0");
		}
		//图片
		if(outDoor.getOutdoor_screen_photoPath()==null) {
			throw new OutDoorScreenException("请上传头像");
		}
		int i = outDoorDao.insertOutDoor(outDoor);
		if(i !=1) {
			throw new OutDoorScreenException("上传资源失败");
		}
		return true;
	}

	//管理媒体资源--加载媒体资源
	public List<OutDoorScreen> loadOutDoor(String userName) {
		if(userName ==null||userName.trim().isEmpty()) {
			throw new OutDoorScreenException("用户错误");
		}
		List<OutDoorScreen> list = outDoorDao.loadOutDoor(userName);
		return list;
	}
	
	//删除媒体资源
	public Boolean deleteMediaResource(String outDoorId) {
		if(outDoorId ==null ||outDoorId.trim().isEmpty()) {
			throw new OutDoorScreenException("ID错误");
		}
		int i = outDoorDao.deleteOutDoor(outDoorId);
		if(i!=1) {
			throw new OutDoorScreenException("删除资源失败");
		}
		
		return true;
	}
	//通过id查询媒体资源
	public OutDoorScreen findOutDoorScreenById(String outDoorId) {
		if(outDoorId ==null ||outDoorId.trim().isEmpty()) {
			throw new OutDoorScreenException("ID错误");
		}
		OutDoorScreen outDoor = outDoorDao.findOutDoorScreenById(outDoorId);
		if(outDoor == null) {
			throw new OutDoorScreenException("出错了");
		}
	
		return outDoor;
	}
	
	//修改媒体资源
	public Boolean modifyOutDoor(OutDoorScreen outDoor) {
		String outDoorId = outDoor.getOutdoor_screen_id();
		OutDoorScreen out = outDoorDao.findOutDoorScreenById(outDoorId);
		String outDoorName = outDoor.getOutdoor_screen_name();
		String province = outDoor.getOutdoor_screen_province();
		String city = outDoor.getOutdoor_screen_city();
		String country = outDoor.getOutdoor_screen_country();
		String address = outDoor.getOutdoor_screen_address();
		String mediasourceType = outDoor.getOutdoor_screen_mediasourceType();
		String screenType = outDoor.getOutdoor_screen_screenType();
		String screenSize = outDoor.getOutdoor_screen_screenSize();
		String length = outDoor.getOutdoor_screen_resolutionRatio_length();
		String height = outDoor.getOutdoor_screen_resolutionRatio_height();
		String startime = outDoor.getOutdoor_screen_playStartTime();
		String endtime = outDoor.getOutdoor_screen_playEndTime();
		String photo = outDoor.getOutdoor_screen_photoPath();
		String superiority = outDoor.getOutdoor_screen_superiority();
		String aptitude = outDoor.getOutdoor_screen_aptitude();
		String remark = outDoor.getOutdoor_screen_remark();
		String playback = outDoor.getOutdoor_screen_playbackPeriod();
		
		if(out.getOutdoor_screen_name().equals(outDoorName)) {
			outDoorName = null;
		}
		if(out.getOutdoor_screen_province().equals(province)) {
			province = null	;
		}
		if(out.getOutdoor_screen_city().equals(city)) {
			city = null;
		}
		if(out.getOutdoor_screen_country().equals(country)) {
			country = null	;
		}
		if(out.getOutdoor_screen_address().equals(address)) {
			address = null;
		}
		if(out.getOutdoor_screen_mediasourceType().equals(mediasourceType)) {
			mediasourceType = null;
		}
		if(out.getOutdoor_screen_screenType().equals(screenType)) {
			screenType = null;
		}
		if(out.getOutdoor_screen_screenSize().equals(screenSize)) {
			screenSize= null;
		}
		if(out.getOutdoor_screen_resolutionRatio_length().equals(length)) {
			length = null;
		}
		if(out.getOutdoor_screen_resolutionRatio_height().equals(height)) {
			height = null;
		}
		if(out.getOutdoor_screen_playStartTime().equals(startime)) {
			startime = null;
		}
		if(out.getOutdoor_screen_playEndTime().equals(endtime)) {
			endtime = null;
		}
		if(out.getOutdoor_screen_photoPath().equals(photo)) {
			photo= null;
		}
		if(out.getOutdoor_screen_superiority().equals(superiority)) {
			superiority = null;
		}
		if(out.getOutdoor_screen_aptitude().equals(aptitude)) {
			aptitude = null;
		}
		if(out.getOutdoor_screen_remark().equals(remark)) {
			remark = null;
		}
		if(out.getOutdoor_screen_playbackPeriod().equals(playback)) {
			playback = null;
		}
		outDoor.setOutdoor_screen_modifyDate(new Timestamp(System.currentTimeMillis()));
		int n = outDoorDao.modifyOutDoor(outDoor);
		if(n != 1) {
			throw new OutDoorScreenException("修改资源失败");
		}
		return true;
	
	
	
	}

}
