package com.phoenix.models;

import com.phoenix.exceptions.UserNotFoundException;
import com.phoenix.services.LoginService;
import com.phoenix.services.LoginServiceImpl;

public class LoginBean {

	private String Username;
	private String Password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	LoginService loginService = new LoginServiceImpl();

	public boolean isValid() throws UserNotFoundException {
		try {
			if (Username.equals(loginService.findUserById(Username).getUsername())
					&& Password.equals(loginService.findUserById(Username).getPassword()))
			{
				return true;
			}
			
			else 
			{
				return false;
			}
		} 
		catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
}
