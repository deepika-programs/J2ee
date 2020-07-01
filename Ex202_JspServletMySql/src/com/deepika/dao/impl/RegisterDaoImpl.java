package com.deepika.dao.impl;

import java.sql.PreparedStatement;

import com.deepika.dao.RegisterDao;
import com.deepika.util.DbUtil;
import com.deepika.vo.User;

public class RegisterDaoImpl implements RegisterDao {

	private final String CLASSNAME = this.getClass().getName(); 

	@Override
	public boolean register(User user) {
		System.out.println("Entering :: " + CLASSNAME + " :: register(User user)");

		/* Example of normal Statement
			try {
				//Connection con = DbUtil.getConnection();
				Statement stmt = DbUtil.getConnection().createStatement();
				String qry = "insert into userinfo(uname, age) values('"+user.getName()+"', "+user.getDob()+")";
				int affectedRows = stmt.executeUpdate(qry);
				System.out.println(affectedRows);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DbUtil.closeConnection();
			}
		*/
		
		//Example of preparedStatement
		try {
			/*
			 * create table userinfo(sno int primary key auto_increment, fullname
			 * varchar(32), dob varchar(10), nation varchar(25), gender varchar(1), pwd
			 * varchar(32), email varchar(50), hobbies varchar(150), activeflag varchar(1));
			 */
			String sql = "insert into userinfo(fullname, dob, nation, gender, pwd, email, hobbies, activeflag ) values (?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = DbUtil.getConnection().prepareStatement(sql);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getDob());
			ps.setString(3, user.getNationality());
			ps.setString(4, user.getGender());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getEmail());
			String hobbies = "";
			for(String h : user.getHobbies()) {
				hobbies = h + " " + hobbies;
				
			}
			ps.setString(7, hobbies);
			ps.setString(8, "N");
			
			int affectedRows = ps.executeUpdate();
			
			System.out.println(CLASSNAME + " :: affected rows ::" + affectedRows);
			if(affectedRows>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection();
			System.out.println("Exiting :: " + CLASSNAME + " :: register(User user)");
		}
		
		return false;
	}

}
