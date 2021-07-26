package com.phoenix.services;

import com.phoenix.exceptions.*;
import com.phoenix.data.*;
import java.util.*;
public interface LoginService {
	
	List<User> findAll() throws ServiceException;
	
	User findUserById(String username) throws UserNotFoundException;
	
	void add(User user) throws UserAlreadyExistException;
	
	void edit(User user) throws ServiceException;
	
	void remove(User user) throws ServiceException;
	
	String changePassord(User user) throws ServiceException;
}
