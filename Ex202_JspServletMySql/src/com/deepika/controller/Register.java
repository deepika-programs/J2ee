package com.deepika.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deepika.service.RegisterService;
import com.deepika.service.impl.RegisterServiceImpl;
import com.deepika.util.ValidateFormData;
import com.deepika.vo.User;


@WebServlet("/register")
public class Register extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private final String CLASSNAME = this.getClass().getName(); 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Entering :: " + CLASSNAME + " :: doPost()");
		
		/*
req.getParameter("hobbies")

	*/
		
		if(ValidateFormData.isEmpty(req.getParameter("name")) || !ValidateFormData.isValidDate(req.getParameter("dob")) ||
			ValidateFormData.isEmpty(req.getParameter("nationality")) || ValidateFormData.isEmpty(req.getParameter("gender")) ||
			!ValidateFormData.isValidEmail(req.getParameter("email")) || ValidateFormData.isEmpty(req.getParameter("password"))) {
			
			System.out.println(CLASSNAME + ":: Validation is not successfull");
			
			req.setAttribute("err", "error");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
			
			System.out.println(CLASSNAME + ":: Redirecting to register.jsp with attribute ");
			
		} else {
			
			System.out.println(CLASSNAME + ":: Validation is successfull");
			
			RegisterService registerService = new RegisterServiceImpl();
			
			System.out.println(CLASSNAME + ":: calling service method");
			
			User u = new User();
			u.setName(req.getParameter("name"));
			u.setDob(req.getParameter("dob"));
			u.setNationality(req.getParameter("nationality"));
			u.setGender(req.getParameter("gender"));
			u.setEmail(req.getParameter("email"));
			u.setPassword(req.getParameter("password"));
			
			String[] hobbies = req.getParameterValues("hobbies");
			
			List<String> hobbyList = null;
			if(hobbies!=null && hobbies.length>0) {
				hobbyList = Arrays.asList(hobbies);
			}
			u.setHobbies(hobbyList);
			
			boolean registerResult = registerService.register(u);
			
			if(registerResult) {
				System.out.println(CLASSNAME + ":: Registration Successfull!");
				
				Cookie c = new Cookie("message" , "Registration-Successfull");
				c.setMaxAge(2);
				resp.addCookie(c);
				
				System.out.println(CLASSNAME + ":: Redirecting to register.jsp with success message");
				resp.sendRedirect("register.jsp");
			}
			
			/*
			System.out.println("Validation Successful");
			
			Connection con = null;
			Statement stmt = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
				stmt = con.createStatement();
				int affectedRows = stmt.executeUpdate("insert into userinfo(uname, age) values('deepika', 22)");
				System.out.println(affectedRows);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			*/
			System.out.println("Exiting :: " + CLASSNAME + " :: doPost()");
		}
		
		
	}
}
