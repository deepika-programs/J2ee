package com.deepika;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
//@WebFilter(servletNames = {"/booksubmit", "/transaction", "/adduser"})
public class CommonFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
		
		System.out.println("This is a common filter...");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		Cookie[] coo = req.getCookies();
		if(coo!=null) {
			for(Cookie c : coo) {
				System.out.println(c.getName() + " : " + c.getValue());
				c.setMaxAge(20);
				resp.addCookie(c);
			}
		}
		
		
		
		String[] vulnerableChar = {"<", ">", "`", "~"};
		
		Enumeration<String> en = request.getParameterNames();
		while(en.hasMoreElements()) {
			String p = en.nextElement();
			System.out.println(p + " : " + request.getParameter(p));
			
			for(String c : vulnerableChar) {
				if(request.getParameter(p).indexOf(c)>=0) {
					resp.sendError(500, "Dont use special char...!");
					break;
				}
			}
			
		}
		
		
		chain.doFilter(request, resp);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
