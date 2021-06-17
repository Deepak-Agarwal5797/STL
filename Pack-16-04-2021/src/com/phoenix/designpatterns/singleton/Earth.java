package com.phoenix.designpatterns.singleton;

public class Earth {

	private static Earth eb;
	
	private Earth()
	{
		System.out.println("Default constructor of Earth");
	}
	
	public static Earth newInstance()
	{
		System.out.println("New instance method is called");
		if(eb==null)
		{
			eb= new Earth();
			//System.out.println("Earth type object ");
		}
		return eb;
	}
	public void createLife()
	{
		System.out.println("Earth life created");
	}
	
	
}
