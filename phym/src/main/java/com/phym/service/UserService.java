package com.phym.service;

import com.phym.entity.User;
import com.phym.exception.NameException;
import com.phym.exception.PasswordException;
import com.phym.exception.PhoneException;
import com.phym.exception.UserException;


public interface UserService {
	//广告登录
	public User GGlogin(String name,String password)throws UserException,NameException,PasswordException;
	//媒体登录
	public User MTlogin(String name,String password)throws UserException,NameException,PasswordException;
	//忘记密码检查手机是否被注册
	public User checkPhone(String phone)throws NameException,PhoneException;
	//注册检查手机是否被注册
	public User checkPhone_r(String phone)throws NameException,PhoneException;
	
	//修改密码
	public User updatePassword(String phone,String auth_code,String password,String rePassword)throws
				UserException,PasswordException;
	//检查用户名	 
	Object checkName(String name)throws NameException,UserException;
	//注册用户
	User regist(String name,String phone,String password,String confirm,int type)throws
				UserException,NameException,PasswordException;
}
