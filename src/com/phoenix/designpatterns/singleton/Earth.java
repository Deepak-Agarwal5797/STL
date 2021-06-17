package com.phoenix.designpatterns.singleton;

public class Earth {

	private static Earth eb;
	
	private Earth()
	{
		System.out.println("Default constructor of Earth");
	}
	
	public static void createLife()
	{
		if(eb==null)
		{
			eb= new Earth();
			System.out.println("Earth type object created");
		}
		
	}
	
	
}
