package com.phoenix.services;

import java.util.List;

import com.phoenix.dao.LoginDao;
import com.phoenix.dao.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundException;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;
	
	public LoginServiceImpl()
	{
		loginDao = new LoginDaoImpl();
	}
	
	@Override
	public List<User> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String changePassord(User user) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
