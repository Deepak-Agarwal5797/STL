/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q15;

public class MyDateC {

	//private non-static fields
	private int day;
	private int month;
	private int year;
	
	// Default constructor
	MyDateC()
	{
		day = 1;
		month=  1;
		year = 2021;
	}
	// Prints the object in dd/mm/yyyy format
	public void printDate()
	{
		System.out.println(day + "/" +month+"/"+year);
	}
}
