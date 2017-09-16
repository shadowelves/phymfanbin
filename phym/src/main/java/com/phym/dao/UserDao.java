package com.phym.dao;

import org.apache.ibatis.annotations.Param;

import com.phym.entity.User;

public interface UserDao {
	//创建一个用户

	public int saveUser(User user);
	
	//通过手机查找用户
	public User findUserByPhone(String phone);
	
	//通过用户名 查找用户
	public User findUserByName(String name);
	
	//更新密码
	public int updatePassword(@Param("phone") String phone,@Param("password") String password);
	
	
	
}
