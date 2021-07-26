package com.phoenix.dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

	public static Connection getConnection(String jdbcDriver,String jdbcUrl,String Username,String Password) throws ClassNotFoundException, SQLException
	{
		Class.forName(jdbcDriver);
		Connection con = DriverManager.getConnection(jdbcUrl, Username, Password);
		if(con!=null)
		System.out.println("Connection successfull");
		return con;
		
	}
}
