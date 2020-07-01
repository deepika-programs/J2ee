package com.deepika.service.impl;

import com.deepika.dao.impl.LoginDaoImpl;
import com.deepika.service.LoginService;
import com.deepika.vo.User;

public class LoginServiceImpl implements LoginService {

	private final String CLASSNAME = this.getClass().getName();
	
	@Override
	public User login(String email, String pwd) {
		System.out.println("Entering :: " + CLASSNAME + " :: login(String email, String pwd)");
		return new LoginDaoImpl().login(email, pwd);
	}

}
