package com.deepika.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deepika.service.LoginService;
import com.deepika.service.impl.LoginServiceImpl;
import com.deepika.util.ValidateFormData;
import com.deepika.vo.User;


@WebServlet("/login")
public class Login extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("doPost called...");
		
		if(!ValidateFormData.isValidEmail(req.getParameter("email")) || ValidateFormData.isEmpty(req.getParameter("password"))) {
			resp.sendRedirect("login.jsp");
		} else {
			System.out.println("Validation Successful");
			//continue to the logic to validate from db
			LoginService loginService = new LoginServiceImpl();
			User user = loginService.login(req.getParameter("email"), req.getParameter("password"));
			
			if(user!=null) {
				req.setAttribute("user", user.getName());
				req.setAttribute("userdob", user.getDob());
				
				req.getRequestDispatcher("landing.jsp").forward(req, resp);
			} else {
				resp.sendRedirect("login.jsp?err=error");
			}
			
			
		}
		
		
	}
}
