package com.phym.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class OutDoorScreen implements Serializable {

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
	private String outdoor_screen_screenSize;//屏幕尺寸
	private String outdoor_screen_resolutionRatio_length;//分辨率 长
	private String outdoor_screen_resolutionRatio_height;//分辨率 高
	private String outdoor_screen_playStartTime;//播放时间开始
	private String outdoor_screen_playEndTime;//播放时间结束
	private String outdoor_screen_userName;//所有者 （媒体主名）
	private int outdoor_screen_status;//状态 （正常）
	private int outdoor_screen_checkStatus;// 审核状态（未通过，通过，拒绝）
	private String outdoor_screen_photoPath;//照片
	private String outdoor_screen_superiority;//优势
	private String outdoor_screen_aptitude;//资质文件
	private Timestamp outdoor_screen_createdDate;//创建时间
	private Timestamp outdoor_screen_modifyDate;//修改时间	
	private String outdoor_screen_remark;//备注
	private String outdoor_screen_frequency;//频次
	private String outdoor_screen_playbackPeriod;//播放周期
	
	
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
	public String getOutdoor_screen_screenSize() {
		return outdoor_screen_screenSize;
	}
	public void setOutdoor_screen_screenSize(String outdoor_screen_screenSize) {
		this.outdoor_screen_screenSize = outdoor_screen_screenSize;
	}
	public String getOutdoor_screen_resolutionRatio_length() {
		return outdoor_screen_resolutionRatio_length;
	}
	public void setOutdoor_screen_resolutionRatio_length(String outdoor_screen_resolutionRatio_length) {
		this.outdoor_screen_resolutionRatio_length = outdoor_screen_resolutionRatio_length;
	}
	public String getOutdoor_screen_resolutionRatio_height() {
		return outdoor_screen_resolutionRatio_height;
	}
	public void setOutdoor_screen_resolutionRatio_height(String outdoor_screen_resolutionRatio_height) {
		this.outdoor_screen_resolutionRatio_height = outdoor_screen_resolutionRatio_height;
	}
	public String getOutdoor_screen_playStartTime() {
		return outdoor_screen_playStartTime;
	}
	public void setOutdoor_screen_playStartTime(String outdoor_screen_playStartTime) {
		this.outdoor_screen_playStartTime = outdoor_screen_playStartTime;
	}
	public String getOutdoor_screen_playEndTime() {
		return outdoor_screen_playEndTime;
	}
	public void setOutdoor_screen_playEndTime(String outdoor_screen_playEndTime) {
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
	public Timestamp getOutdoor_screen_modifyDate() {
		return outdoor_screen_modifyDate;
	}
	public void setOutdoor_screen_modifyDate(Timestamp outdoor_screen_modifyDate) {
		this.outdoor_screen_modifyDate = outdoor_screen_modifyDate;
	}
	public String getOutdoor_screen_remark() {
		return outdoor_screen_remark;
	}
	public void setOutdoor_screen_remark(String outdoor_screen_remark) {
		this.outdoor_screen_remark = outdoor_screen_remark;
	}
	public String getOutdoor_screen_frequency() {
		return outdoor_screen_frequency;
	}
	public void setOutdoor_screen_frequency(String outdoor_screen_frequency) {
		this.outdoor_screen_frequency = outdoor_screen_frequency;
	}
	public String getOutdoor_screen_playbackPeriod() {
		return outdoor_screen_playbackPeriod;
	}
	public void setOutdoor_screen_playbackPeriod(String outdoor_screen_playbackPeriod) {
		this.outdoor_screen_playbackPeriod = outdoor_screen_playbackPeriod;
	}
	public OutDoorScreen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OutDoorScreen(String outdoor_screen_id, String outdoor_screen_name, String outdoor_screen_province,
			String outdoor_screen_city, String outdoor_screen_country, String outdoor_screen_address,
			String outdoor_screen_mediasourceType, String outdoor_screen_screenType, String outdoor_screen_screenSize,
			String outdoor_screen_resolutionRatio_length, String outdoor_screen_resolutionRatio_height,
			String outdoor_screen_playStartTime, String outdoor_screen_playEndTime, String outdoor_screen_userName,
			int outdoor_screen_status, int outdoor_screen_checkStatus, String outdoor_screen_photoPath,
			String outdoor_screen_superiority, String outdoor_screen_aptitude, Timestamp outdoor_screen_createdDate,
			Timestamp outdoor_screen_modifyDate, String outdoor_screen_remark, String outdoor_screen_frequency,
			String outdoor_screen_playbackPeriod) {
		super();
		this.outdoor_screen_id = outdoor_screen_id;
		this.outdoor_screen_name = outdoor_screen_name;
		this.outdoor_screen_province = outdoor_screen_province;
		this.outdoor_screen_city = outdoor_screen_city;
		this.outdoor_screen_country = outdoor_screen_country;
		this.outdoor_screen_address = outdoor_screen_address;
		this.outdoor_screen_mediasourceType = outdoor_screen_mediasourceType;
		this.outdoor_screen_screenType = outdoor_screen_screenType;
		this.outdoor_screen_screenSize = outdoor_screen_screenSize;
		this.outdoor_screen_resolutionRatio_length = outdoor_screen_resolutionRatio_length;
		this.outdoor_screen_resolutionRatio_height = outdoor_screen_resolutionRatio_height;
		this.outdoor_screen_playStartTime = outdoor_screen_playStartTime;
		this.outdoor_screen_playEndTime = outdoor_screen_playEndTime;
		this.outdoor_screen_userName = outdoor_screen_userName;
		this.outdoor_screen_status = outdoor_screen_status;
		this.outdoor_screen_checkStatus = outdoor_screen_checkStatus;
		this.outdoor_screen_photoPath = outdoor_screen_photoPath;
		this.outdoor_screen_superiority = outdoor_screen_superiority;
		this.outdoor_screen_aptitude = outdoor_screen_aptitude;
		this.outdoor_screen_createdDate = outdoor_screen_createdDate;
		this.outdoor_screen_modifyDate = outdoor_screen_modifyDate;
		this.outdoor_screen_remark = outdoor_screen_remark;
		this.outdoor_screen_frequency = outdoor_screen_frequency;
		this.outdoor_screen_playbackPeriod = outdoor_screen_playbackPeriod;
	}
	@Override
	public String toString() {
		return "OutDoorScreen [outdoor_screen_id=" + outdoor_screen_id + ", outdoor_screen_name=" + outdoor_screen_name
				+ ", outdoor_screen_province=" + outdoor_screen_province + ", outdoor_screen_city="
				+ outdoor_screen_city + ", outdoor_screen_country=" + outdoor_screen_country
				+ ", outdoor_screen_address=" + outdoor_screen_address + ", outdoor_screen_mediasourceType="
				+ outdoor_screen_mediasourceType + ", outdoor_screen_screenType=" + outdoor_screen_screenType
				+ ", outdoor_screen_screenSize=" + outdoor_screen_screenSize
				+ ", outdoor_screen_resolutionRatio_length=" + outdoor_screen_resolutionRatio_length
				+ ", outdoor_screen_resolutionRatio_height=" + outdoor_screen_resolutionRatio_height
				+ ", outdoor_screen_playStartTime=" + outdoor_screen_playStartTime + ", outdoor_screen_playEndTime="
				+ outdoor_screen_playEndTime + ", outdoor_screen_userName=" + outdoor_screen_userName
				+ ", outdoor_screen_status=" + outdoor_screen_status + ", outdoor_screen_checkStatus="
				+ outdoor_screen_checkStatus + ", outdoor_screen_photoPath=" + outdoor_screen_photoPath
				+ ", outdoor_screen_superiority=" + outdoor_screen_superiority + ", outdoor_screen_aptitude="
				+ outdoor_screen_aptitude + ", outdoor_screen_createdDate=" + outdoor_screen_createdDate
				+ ", outdoor_screen_modifyDate=" + outdoor_screen_modifyDate + ", outdoor_screen_remark="
				+ outdoor_screen_remark + ", outdoor_screen_frequency=" + outdoor_screen_frequency
				+ ", outdoor_screen_playbackPeriod=" + outdoor_screen_playbackPeriod + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((outdoor_screen_address == null) ? 0 : outdoor_screen_address.hashCode());
		result = prime * result + ((outdoor_screen_aptitude == null) ? 0 : outdoor_screen_aptitude.hashCode());
		result = prime * result + outdoor_screen_checkStatus;
		result = prime * result + ((outdoor_screen_city == null) ? 0 : outdoor_screen_city.hashCode());
		result = prime * result + ((outdoor_screen_country == null) ? 0 : outdoor_screen_country.hashCode());
		result = prime * result + ((outdoor_screen_createdDate == null) ? 0 : outdoor_screen_createdDate.hashCode());
		result = prime * result + ((outdoor_screen_frequency == null) ? 0 : outdoor_screen_frequency.hashCode());
		result = prime * result + ((outdoor_screen_id == null) ? 0 : outdoor_screen_id.hashCode());
		result = prime * result
				+ ((outdoor_screen_mediasourceType == null) ? 0 : outdoor_screen_mediasourceType.hashCode());
		result = prime * result + ((outdoor_screen_modifyDate == null) ? 0 : outdoor_screen_modifyDate.hashCode());
		result = prime * result + ((outdoor_screen_name == null) ? 0 : outdoor_screen_name.hashCode());
		result = prime * result + ((outdoor_screen_photoPath == null) ? 0 : outdoor_screen_photoPath.hashCode());
		result = prime * result + ((outdoor_screen_playEndTime == null) ? 0 : outdoor_screen_playEndTime.hashCode());
		result = prime * result
				+ ((outdoor_screen_playStartTime == null) ? 0 : outdoor_screen_playStartTime.hashCode());
		result = prime * result
				+ ((outdoor_screen_playbackPeriod == null) ? 0 : outdoor_screen_playbackPeriod.hashCode());
		result = prime * result + ((outdoor_screen_province == null) ? 0 : outdoor_screen_province.hashCode());
		result = prime * result + ((outdoor_screen_remark == null) ? 0 : outdoor_screen_remark.hashCode());
		result = prime * result + ((outdoor_screen_resolutionRatio_height == null) ? 0
				: outdoor_screen_resolutionRatio_height.hashCode());
		result = prime * result + ((outdoor_screen_resolutionRatio_length == null) ? 0
				: outdoor_screen_resolutionRatio_length.hashCode());
		result = prime * result + ((outdoor_screen_screenSize == null) ? 0 : outdoor_screen_screenSize.hashCode());
		result = prime * result + ((outdoor_screen_screenType == null) ? 0 : outdoor_screen_screenType.hashCode());
		result = prime * result + outdoor_screen_status;
		result = prime * result + ((outdoor_screen_superiority == null) ? 0 : outdoor_screen_superiority.hashCode());
		result = prime * result + ((outdoor_screen_userName == null) ? 0 : outdoor_screen_userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OutDoorScreen other = (OutDoorScreen) obj;
		if (outdoor_screen_address == null) {
			if (other.outdoor_screen_address != null)
				return false;
		} else if (!outdoor_screen_address.equals(other.outdoor_screen_address))
			return false;
		if (outdoor_screen_aptitude == null) {
			if (other.outdoor_screen_aptitude != null)
				return false;
		} else if (!outdoor_screen_aptitude.equals(other.outdoor_screen_aptitude))
			return false;
		if (outdoor_screen_checkStatus != other.outdoor_screen_checkStatus)
			return false;
		if (outdoor_screen_city == null) {
			if (other.outdoor_screen_city != null)
				return false;
		} else if (!outdoor_screen_city.equals(other.outdoor_screen_city))
			return false;
		if (outdoor_screen_country == null) {
			if (other.outdoor_screen_country != null)
				return false;
		} else if (!outdoor_screen_country.equals(other.outdoor_screen_country))
			return false;
		if (outdoor_screen_createdDate == null) {
			if (other.outdoor_screen_createdDate != null)
				return false;
		} else if (!outdoor_screen_createdDate.equals(other.outdoor_screen_createdDate))
			return false;
		if (outdoor_screen_frequency == null) {
			if (other.outdoor_screen_frequency != null)
				return false;
		} else if (!outdoor_screen_frequency.equals(other.outdoor_screen_frequency))
			return false;
		if (outdoor_screen_id == null) {
			if (other.outdoor_screen_id != null)
				return false;
		} else if (!outdoor_screen_id.equals(other.outdoor_screen_id))
			return false;
		if (outdoor_screen_mediasourceType == null) {
			if (other.outdoor_screen_mediasourceType != null)
				return false;
		} else if (!outdoor_screen_mediasourceType.equals(other.outdoor_screen_mediasourceType))
			return false;
		if (outdoor_screen_modifyDate == null) {
			if (other.outdoor_screen_modifyDate != null)
				return false;
		} else if (!outdoor_screen_modifyDate.equals(other.outdoor_screen_modifyDate))
			return false;
		if (outdoor_screen_name == null) {
			if (other.outdoor_screen_name != null)
				return false;
		} else if (!outdoor_screen_name.equals(other.outdoor_screen_name))
			return false;
		if (outdoor_screen_photoPath == null) {
			if (other.outdoor_screen_photoPath != null)
				return false;
		} else if (!outdoor_screen_photoPath.equals(other.outdoor_screen_photoPath))
			return false;
		if (outdoor_screen_playEndTime == null) {
			if (other.outdoor_screen_playEndTime != null)
				return false;
		} else if (!outdoor_screen_playEndTime.equals(other.outdoor_screen_playEndTime))
			return false;
		if (outdoor_screen_playStartTime == null) {
			if (other.outdoor_screen_playStartTime != null)
				return false;
		} else if (!outdoor_screen_playStartTime.equals(other.outdoor_screen_playStartTime))
			return false;
		if (outdoor_screen_playbackPeriod == null) {
			if (other.outdoor_screen_playbackPeriod != null)
				return false;
		} else if (!outdoor_screen_playbackPeriod.equals(other.outdoor_screen_playbackPeriod))
			return false;
		if (outdoor_screen_province == null) {
			if (other.outdoor_screen_province != null)
				return false;
		} else if (!outdoor_screen_province.equals(other.outdoor_screen_province))
			return false;
		if (outdoor_screen_remark == null) {
			if (other.outdoor_screen_remark != null)
				return false;
		} else if (!outdoor_screen_remark.equals(other.outdoor_screen_remark))
			return false;
		if (outdoor_screen_resolutionRatio_height == null) {
			if (other.outdoor_screen_resolutionRatio_height != null)
				return false;
		} else if (!outdoor_screen_resolutionRatio_height.equals(other.outdoor_screen_resolutionRatio_height))
			return false;
		if (outdoor_screen_resolutionRatio_length == null) {
			if (other.outdoor_screen_resolutionRatio_length != null)
				return false;
		} else if (!outdoor_screen_resolutionRatio_length.equals(other.outdoor_screen_resolutionRatio_length))
			return false;
		if (outdoor_screen_screenSize == null) {
			if (other.outdoor_screen_screenSize != null)
				return false;
		} else if (!outdoor_screen_screenSize.equals(other.outdoor_screen_screenSize))
			return false;
		if (outdoor_screen_screenType == null) {
			if (other.outdoor_screen_screenType != null)
				return false;
		} else if (!outdoor_screen_screenType.equals(other.outdoor_screen_screenType))
			return false;
		if (outdoor_screen_status != other.outdoor_screen_status)
			return false;
		if (outdoor_screen_superiority == null) {
			if (other.outdoor_screen_superiority != null)
				return false;
		} else if (!outdoor_screen_superiority.equals(other.outdoor_screen_superiority))
			return false;
		if (outdoor_screen_userName == null) {
			if (other.outdoor_screen_userName != null)
				return false;
		} else if (!outdoor_screen_userName.equals(other.outdoor_screen_userName))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
