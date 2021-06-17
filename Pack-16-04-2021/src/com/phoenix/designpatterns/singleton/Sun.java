package com.phoenix.designpatterns.singleton;

public class Sun {
	
	private static Sun eb;
	
	private Sun()
	{
		System.out.println("Default constructor of Sun");
	}
	
	public static void giveLight()
	{
		if(eb==null)
		{
			eb= new Sun();
			System.out.println("Sun type object created");
		}
		
	}
}
