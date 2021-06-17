/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q18;

import java.awt.datatransfer.SystemFlavorMap;

public class MyDateP {
	
	// non-static private variables
	private int day;
	private int month;
	private int year;
	
	// Default constructor with this 
	MyDateP()
	{
		this(8,6,2021);
		System.out.println("Default Constructor");
		
	}
	//Parameterized constructor
	MyDateP(int day,int month,int year)
	{
		System.out.println("Parameterized Constructor");
		this.day = day;
		this.month =month;
		this.year = year;
	}
	
	// Prints in format dd/mm/yyyy
	public void printDate()
	{
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	
	
}
