package com.deepika.service;

import com.deepika.vo.User;

public interface LoginService {
	
	public User login(String email, String pwd);

}
