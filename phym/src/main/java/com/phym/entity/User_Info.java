package com.phym.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class User_Info implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3449636738506668786L;
	private String user_info_id;//id
	private String user_id;// 用户id
	private String user_info_name;//真实姓名
	private String user_info_tel;//座机
	private String user_info_addr;//地址
	private String user_info_email;//邮箱
	private String user_info_company;//公司
	private Timestamp user_info_updateTime;//更新时间
	private String user_info_headimg;//头像
	private String user_info_agency_name;//代理商名称
	private int user_info_agency_number;//代理商编号
	public String getUser_info_id() {
		return user_info_id;
	}
	public void setUser_info_id(String user_info_id) {
		this.user_info_id = user_info_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_info_name() {
		return user_info_name;
	}
	public void setUser_info_name(String user_info_name) {
		this.user_info_name = user_info_name;
	}
	public String getUser_info_tel() {
		return user_info_tel;
	}
	public void setUser_info_tel(String user_info_tel) {
		this.user_info_tel = user_info_tel;
	}
	public String getUser_info_addr() {
		return user_info_addr;
	}
	public void setUser_info_addr(String user_info_addr) {
		this.user_info_addr = user_info_addr;
	}
	public String getUser_info_email() {
		return user_info_email;
	}
	public void setUser_info_email(String user_info_email) {
		this.user_info_email = user_info_email;
	}
	public String getUser_info_company() {
		return user_info_company;
	}
	public void setUser_info_company(String user_info_company) {
		this.user_info_company = user_info_company;
	}
	public Timestamp getUser_info_updateTime() {
		return user_info_updateTime;
	}
	public void setUser_info_updateTime(Timestamp user_info_updateTime) {
		this.user_info_updateTime = user_info_updateTime;
	}
	public String getUser_info_headimg() {
		return user_info_headimg;
	}
	public void setUser_info_headimg(String user_info_headimg) {
		this.user_info_headimg = user_info_headimg;
	}
	public String getUser_info_agency_name() {
		return user_info_agency_name;
	}
	public void setUser_info_agency_name(String user_info_agency_name) {
		this.user_info_agency_name = user_info_agency_name;
	}
	public int getUser_info_agency_number() {
		return user_info_agency_number;
	}
	public void setUser_info_agency_number(int user_info_agency_number) {
		this.user_info_agency_number = user_info_agency_number;
	}
	public User_Info(String user_info_id, String user_id, String user_info_name, String user_info_tel,
			String user_info_addr, String user_info_email, String user_info_company, Timestamp user_info_updateTime,
			String user_info_headimg, String user_info_agency_name, int user_info_agency_number) {
		super();
		this.user_info_id = user_info_id;
		this.user_id = user_id;
		this.user_info_name = user_info_name;
		this.user_info_tel = user_info_tel;
		this.user_info_addr = user_info_addr;
		this.user_info_email = user_info_email;
		this.user_info_company = user_info_company;
		this.user_info_updateTime = user_info_updateTime;
		this.user_info_headimg = user_info_headimg;
		this.user_info_agency_name = user_info_agency_name;
		this.user_info_agency_number = user_info_agency_number;
	}
	public User_Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User_Info [user_info_id=" + user_info_id + ", user_id=" + user_id + ", user_info_name=" + user_info_name
				+ ", user_info_tel=" + user_info_tel + ", user_info_addr=" + user_info_addr + ", user_info_email="
				+ user_info_email + ", user_info_company=" + user_info_company + ", user_info_updateTime="
				+ user_info_updateTime + ", user_info_headimg=" + user_info_headimg + ", user_info_agency_name="
				+ user_info_agency_name + ", user_info_agency_number=" + user_info_agency_number + "]";
	}
	
	
	

	
	
	
	
	
	
	
}
