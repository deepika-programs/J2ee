package com.deepika.service;

import com.deepika.vo.User;

public interface RegisterService {

	public boolean register(User user);
	public boolean sendEmail(String emailId, String message);
	
}
