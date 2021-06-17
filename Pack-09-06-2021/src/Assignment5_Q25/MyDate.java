/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q25;

import java.awt.datatransfer.SystemFlavorMap;

public class MyDate {
	
	// non-static private variables
	public int day;
	public int month;
	public int year;
	
	
	//Parameterized constructor
	MyDate(int day,int month,int year)
	{
		this.day = day;
		this.month =month;
		this.year = year;
	}
	
	public String toString()
	{
		return (day+"/"+month+"/"+year);
		
	}
	
	
	
}
