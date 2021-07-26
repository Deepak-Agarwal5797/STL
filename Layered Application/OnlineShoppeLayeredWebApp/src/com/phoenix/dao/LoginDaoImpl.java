package com.phoenix.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.User;
import com.phoenix.dbConfig.OracleConnection;

public class LoginDaoImpl implements LoginDao {
	
	private static Connection con;

	static {
		try {
			con = OracleConnection.getOracleConnection();
			System.out.println("Connection Established");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<User> getAll() throws SQLException {
		
		Statement s = con.createStatement();
		String sql = "select * from users";
		ResultSet rs = s.executeQuery(sql);
		ArrayList<User> userList = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			userList.add(user);
		}
		return userList;
		
		
	}

	@Override
	public User getUSerById(String userName) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select username,password from login where username=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, userName);
		ResultSet rs = stmt.executeQuery();
		
		if (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		} else {
			return null;
		}
	}

	@Override
	public void insert(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "Insert into login(username,password) values(?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, user.getUsername());
		stmt.setString(2, user.getPassword());
		int updateCount = stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("New user added ");

		} else {
			System.out.println("Sorry! not able to add a user ");
		}
		
		
	}

	@Override
	public void delete(User user) throws SQLException {
		
		String sql="delete from login where username=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1, user.getUsername());
		int updateCount =stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("User deleted");

		} else {
			System.out.println("Sorry! user not able to delete");
		}
		
	}

	@Override
	public void update(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql="update login set password=? where username=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setString(2, user.getUsername());
		stmt.setString(1, user.getPassword());
		
		int updateCount = stmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("User updated");

		} else {
			System.out.println("Sorry not able to update");
		}
	}

}
