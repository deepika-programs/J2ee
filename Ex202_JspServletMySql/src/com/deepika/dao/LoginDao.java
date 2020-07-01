package com.deepika.dao;
import com.deepika.vo.User;

public interface LoginDao {
	
	public User login(String email, String pwd);

}