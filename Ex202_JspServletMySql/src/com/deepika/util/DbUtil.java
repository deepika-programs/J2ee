package com.deepika.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	static Connection con = null;
	
	public static Connection getConnection() {
		try {
			// Load mysql driver into memory
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection object
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeConnection() {
		try {
			if(con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
