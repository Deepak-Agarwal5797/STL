package com.phoenix.lambda;

public class Message {

	String msg;
	
	public Message()
	{
		System.out.println("Default od Message");
	}
	
	public Message(String msg)
	{
		System.out.println("PAramneter");
		this.msg=  msg;
	}
	
	public String getMsg()
	{
		return this.msg;
	}
	
}
