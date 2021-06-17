package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	private static PrimeMinister eb;
	
	private PrimeMinister()
	{
		System.out.println("Default constructor of Prime Minister");
	}
	
	public static void serveNation()
	{
		if(eb==null)
		{
			eb= new PrimeMinister();
			System.out.println("Prime Minister type object created");
		}
		
	}
}
