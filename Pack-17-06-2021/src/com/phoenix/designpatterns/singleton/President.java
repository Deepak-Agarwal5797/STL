package com.phoenix.designpatterns.singleton;

public class President {

	private static President eb;
	
	private President()
	{
		System.out.println("Default constructor of President");
	}
	
	public static void representNation()
	{
		if(eb==null)
		{
			eb= new President();
			System.out.println("President type object created");
		}
		
	}
}
