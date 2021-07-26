package com.phoenix.dao;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.User;


public interface LoginDao {
	
	List<User> getAll() throws SQLException;
	
	User getUSerById(String userName) throws SQLException;
	
	void insert(User user) throws SQLException;
	
	void delete(User user) throws SQLException;
	
	void update(User user) throws SQLException;
}
