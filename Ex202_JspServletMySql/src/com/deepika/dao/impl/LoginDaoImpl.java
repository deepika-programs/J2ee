package com.deepika.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import com.deepika.dao.LoginDao;
import com.deepika.util.DbUtil;
import com.deepika.vo.User;

public class LoginDaoImpl implements LoginDao {
	private final String CLASSNAME = this.getClass().getName();

	@Override
	public User login(String email, String pwd) {
		System.out.println("Entering :: " + CLASSNAME + " :: login(String email, String pwd)");
		User user = null;
		try {
			String query = "select * from userinfo where email=? and pwd=? and lower(activeflag)=lower(?)";
			PreparedStatement ps = DbUtil.getConnection().prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pwd);
			ps.setString(3, "Y");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				if(user==null) {
					user = new User();
				}
				
				user.setName(rs.getString("fullname"));
				user.setDob(rs.getString("dob"));
				user.setEmail(rs.getString("email"));
				user.setGender(rs.getString("gender"));
				user.setNationality(rs.getString("nation"));
				
				String[] hobbies =  (rs.getString("nation")!=null) ? rs.getString("nation").split(" ") : null;
				
				List<String> hobbyList = null;
				if(hobbies!=null && hobbies.length>0) {
					hobbyList = Arrays.asList(hobbies);
				}
				user.setHobbies(hobbyList);
			}
			
			System.out.println(CLASSNAME + " :: " + user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection();
		}
		System.out.println("Exiting :: " + CLASSNAME + " :: login(String email, String pwd)");
		return user;
	}

}
