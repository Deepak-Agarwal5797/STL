package com.phoenix.dbConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser = "hr";
		String dbPassword = "HR";
		return DbConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
	}
}
