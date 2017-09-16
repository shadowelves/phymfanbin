package com.phym.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class OutDoor_Screen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5616725654269362702L;
	private String outdoor_screen_id;//  id
	private String outdoor_screen_name;// 媒体名称
	private String outdoor_screen_province;// 省
	private String outdoor_screen_city;// 市
	private String outdoor_screen_country;// 区/县
	private String outdoor_screen_address;//资源地址
	private String outdoor_screen_mediasourceType;//媒体属性（合约/非合约）
	private String outdoor_screen_screenType;//屏幕类型 （跨街，横屏，竖屏）
	private int outdoor_screen_resolutionRatio_length;//分辨率 长
	private int outdoor_screen_resolutionRatio_heigth;//分辨率 高
	private int outdoor_screen_playStartTime;//播放时间开始
	private int outdoor_screen_playEndTime;//播放时间结束
	private String outdoor_screen_userName;//所有者 （媒体主名）
	private int outdoor_screen_status;//状态 （正常）
	private int outdoor_screen_checkStatus;// 审核状态（未通过，通过，拒绝）
	private String outdoor_screen_photoPath;//照片
	private String outdoor_screen_superiority;//优势
	private String outdoor_screen_aptitude;//资质文件
	private Timestamp outdoor_screen_createdDate;//创建时间
	private String outdoor_screen_remark;//备注
	private int outdoor_screen_frequency;//频次
	private int outdoor_screen_playbackPeriod;//播放周期
	public String getOutdoor_screen_id() {
		return outdoor_screen_id;
	}
	public void setOutdoor_screen_id(String outdoor_screen_id) {
		this.outdoor_screen_id = outdoor_screen_id;
	}
	public String getOutdoor_screen_name() {
		return outdoor_screen_name;
	}
	public void setOutdoor_screen_name(String outdoor_screen_name) {
		this.outdoor_screen_name = outdoor_screen_name;
	}
	public String getOutdoor_screen_province() {
		return outdoor_screen_province;
	}
	public void setOutdoor_screen_province(String outdoor_screen_province) {
		this.outdoor_screen_province = outdoor_screen_province;
	}
	public String getOutdoor_screen_city() {
		return outdoor_screen_city;
	}
	public void setOutdoor_screen_city(String outdoor_screen_city) {
		this.outdoor_screen_city = outdoor_screen_city;
	}
	public String getOutdoor_screen_country() {
		return outdoor_screen_country;
	}
	public void setOutdoor_screen_country(String outdoor_screen_country) {
		this.outdoor_screen_country = outdoor_screen_country;
	}
	public String getOutdoor_screen_address() {
		return outdoor_screen_address;
	}
	public void setOutdoor_screen_address(String outdoor_screen_address) {
		this.outdoor_screen_address = outdoor_screen_address;
	}
	public String getOutdoor_screen_mediasourceType() {
		return outdoor_screen_mediasourceType;
	}
	public void setOutdoor_screen_mediasourceType(String outdoor_screen_mediasourceType) {
		this.outdoor_screen_mediasourceType = outdoor_screen_mediasourceType;
	}
	public String getOutdoor_screen_screenType() {
		return outdoor_screen_screenType;
	}
	public void setOutdoor_screen_screenType(String outdoor_screen_screenType) {
		this.outdoor_screen_screenType = outdoor_screen_screenType;
	}
	public int getOutdoor_screen_resolutionRatio_length() {
		return outdoor_screen_resolutionRatio_length;
	}
	public void setOutdoor_screen_resolutionRatio_length(int outdoor_screen_resolutionRatio_length) {
		this.outdoor_screen_resolutionRatio_length = outdoor_screen_resolutionRatio_length;
	}
	public int getOutdoor_screen_resolutionRatio_heigth() {
		return outdoor_screen_resolutionRatio_heigth;
	}
	public void setOutdoor_screen_resolutionRatio_heigth(int outdoor_screen_resolutionRatio_heigth) {
		this.outdoor_screen_resolutionRatio_heigth = outdoor_screen_resolutionRatio_heigth;
	}
	public int getOutdoor_screen_playStartTime() {
		return outdoor_screen_playStartTime;
	}
	public void setOutdoor_screen_playStartTime(int outdoor_screen_playStartTime) {
		this.outdoor_screen_playStartTime = outdoor_screen_playStartTime;
	}
	public int getOutdoor_screen_playEndTime() {
		return outdoor_screen_playEndTime;
	}
	public void setOutdoor_screen_playEndTime(int outdoor_screen_playEndTime) {
		this.outdoor_screen_playEndTime = outdoor_screen_playEndTime;
	}
	public String getOutdoor_screen_userName() {
		return outdoor_screen_userName;
	}
	public void setOutdoor_screen_userName(String outdoor_screen_userName) {
		this.outdoor_screen_userName = outdoor_screen_userName;
	}
	public int getOutdoor_screen_status() {
		return outdoor_screen_status;
	}
	public void setOutdoor_screen_status(int outdoor_screen_status) {
		this.outdoor_screen_status = outdoor_screen_status;
	}
	public int getOutdoor_screen_checkStatus() {
		return outdoor_screen_checkStatus;
	}
	public void setOutdoor_screen_checkStatus(int outdoor_screen_checkStatus) {
		this.outdoor_screen_checkStatus = outdoor_screen_checkStatus;
	}
	public String getOutdoor_screen_photoPath() {
		return outdoor_screen_photoPath;
	}
	public void setOutdoor_screen_photoPath(String outdoor_screen_photoPath) {
		this.outdoor_screen_photoPath = outdoor_screen_photoPath;
	}
	public String getOutdoor_screen_superiority() {
		return outdoor_screen_superiority;
	}
	public void setOutdoor_screen_superiority(String outdoor_screen_superiority) {
		this.outdoor_screen_superiority = outdoor_screen_superiority;
	}
	public String getOutdoor_screen_aptitude() {
		return outdoor_screen_aptitude;
	}
	public void setOutdoor_screen_aptitude(String outdoor_screen_aptitude) {
		this.outdoor_screen_aptitude = outdoor_screen_aptitude;
	}
	public Timestamp getOutdoor_screen_createdDate() {
		return outdoor_screen_createdDate;
	}
	public void setOutdoor_screen_createdDate(Timestamp outdoor_screen_createdDate) {
		this.outdoor_screen_createdDate = outdoor_screen_createdDate;
	}
	public String getOutdoor_screen_remark() {
		return outdoor_screen_remark;
	}
	public void setOutdoor_screen_remark(String outdoor_screen_remark) {
		this.outdoor_screen_remark = outdoor_screen_remark;
	}
	public int getOutdoor_screen_frequency() {
		return outdoor_screen_frequency;
	}
	public void setOutdoor_screen_frequency(int outdoor_screen_frequency) {
		this.outdoor_screen_frequency = outdoor_screen_frequency;
	}
	public int getOutdoor_screen_playbackPeriod() {
		return outdoor_screen_playbackPeriod;
	}
	public void setOutdoor_screen_playbackPeriod(int outdoor_screen_playbackPeriod) {
		this.outdoor_screen_playbackPeriod = outdoor_screen_playbackPeriod;
	}
	public OutDoor_Screen(String outdoor_screen_id, String outdoor_screen_name, String outdoor_screen_province,
			String outdoor_screen_city, String outdoor_screen_country, String outdoor_screen_address,
			String outdoor_screen_mediasourceType, String outdoor_screen_screenType,
			int outdoor_screen_resolutionRatio_length, int outdoor_screen_resolutionRatio_heigth,
			int outdoor_screen_playStartTime, int outdoor_screen_playEndTime, String outdoor_screen_userName,
			int outdoor_screen_status, int outdoor_screen_checkStatus, String outdoor_screen_photoPath,
			String outdoor_screen_superiority, String outdoor_screen_aptitude, Timestamp outdoor_screen_createdDate,
			String outdoor_screen_remark, int outdoor_screen_frequency, int outdoor_screen_playbackPeriod) {
		super();
		this.outdoor_screen_id = outdoor_screen_id;
		this.outdoor_screen_name = outdoor_screen_name;
		this.outdoor_screen_province = outdoor_screen_province;
		this.outdoor_screen_city = outdoor_screen_city;
		this.outdoor_screen_country = outdoor_screen_country;
		this.outdoor_screen_address = outdoor_screen_address;
		this.outdoor_screen_mediasourceType = outdoor_screen_mediasourceType;
		this.outdoor_screen_screenType = outdoor_screen_screenType;
		this.outdoor_screen_resolutionRatio_length = outdoor_screen_resolutionRatio_length;
		this.outdoor_screen_resolutionRatio_heigth = outdoor_screen_resolutionRatio_heigth;
		this.outdoor_screen_playStartTime = outdoor_screen_playStartTime;
		this.outdoor_screen_playEndTime = outdoor_screen_playEndTime;
		this.outdoor_screen_userName = outdoor_screen_userName;
		this.outdoor_screen_status = outdoor_screen_status;
		this.outdoor_screen_checkStatus = outdoor_screen_checkStatus;
		this.outdoor_screen_photoPath = outdoor_screen_photoPath;
		this.outdoor_screen_superiority = outdoor_screen_superiority;
		this.outdoor_screen_aptitude = outdoor_screen_aptitude;
		this.outdoor_screen_createdDate = outdoor_screen_createdDate;
		this.outdoor_screen_remark = outdoor_screen_remark;
		this.outdoor_screen_frequency = outdoor_screen_frequency;
		this.outdoor_screen_playbackPeriod = outdoor_screen_playbackPeriod;
	}
	public OutDoor_Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OutDoor_Screen [outdoor_screen_id=" + outdoor_screen_id + ", outdoor_screen_name=" + outdoor_screen_name
				+ ", outdoor_screen_province=" + outdoor_screen_province + ", outdoor_screen_city="
				+ outdoor_screen_city + ", outdoor_screen_country=" + outdoor_screen_country
				+ ", outdoor_screen_address=" + outdoor_screen_address + ", outdoor_screen_mediasourceType="
				+ outdoor_screen_mediasourceType + ", outdoor_screen_screenType=" + outdoor_screen_screenType
				+ ", outdoor_screen_resolutionRatio_length=" + outdoor_screen_resolutionRatio_length
				+ ", outdoor_screen_resolutionRatio_heigth=" + outdoor_screen_resolutionRatio_heigth
				+ ", outdoor_screen_playStartTime=" + outdoor_screen_playStartTime + ", outdoor_screen_playEndTime="
				+ outdoor_screen_playEndTime + ", outdoor_screen_userName=" + outdoor_screen_userName
				+ ", outdoor_screen_status=" + outdoor_screen_status + ", outdoor_screen_checkStatus="
				+ outdoor_screen_checkStatus + ", outdoor_screen_photoPath=" + outdoor_screen_photoPath
				+ ", outdoor_screen_superiority=" + outdoor_screen_superiority + ", outdoor_screen_aptitude="
				+ outdoor_screen_aptitude + ", outdoor_screen_createdDate=" + outdoor_screen_createdDate
				+ ", outdoor_screen_remark=" + outdoor_screen_remark + ", outdoor_screen_frequency="
				+ outdoor_screen_frequency + ", outdoor_screen_playbackPeriod=" + outdoor_screen_playbackPeriod + "]";
	}
	
	

}
