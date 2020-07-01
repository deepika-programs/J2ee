package com.deepika.service.impl;

import com.deepika.dao.RegisterDao;
import com.deepika.dao.impl.RegisterDaoImpl;
import com.deepika.service.RegisterService;
import com.deepika.vo.User;

public class RegisterServiceImpl implements RegisterService {

	private final String CLASSNAME = this.getClass().getName(); 
	
	@Override
	public boolean register(User user) {
		
		System.out.println("Entering :: " + CLASSNAME + " :: register(User user)");
		
		System.out.println("Register Service- Service Layer");
		
		RegisterDao registerDao = new RegisterDaoImpl();
		boolean result = registerDao.register(user);
		
		if(result) {
			System.out.println(CLASSNAME + " :: Registration Successfull!");
			boolean emailResult = sendEmail(user.getEmail(), "Registration Successfull");
			if(emailResult) {
				System.out.println(CLASSNAME + " :: Email has been Sent Successfully!");
			}
		}
		
		System.out.println("Exiting :: " + CLASSNAME + " :: register(User user)");
		
		return result;
	}

	@Override
	public boolean sendEmail(String emailId, String message) {
		
		System.out.println("Entering :: " + CLASSNAME + " :: sendEmail(String emailId, String message)");
		
		System.out.println(CLASSNAME + " :: Sending Email to "+ emailId);
		
		System.out.println("Exiting :: " + CLASSNAME + " :: sendEmail(String emailId, String message)");
		
		return true;
	}

}
