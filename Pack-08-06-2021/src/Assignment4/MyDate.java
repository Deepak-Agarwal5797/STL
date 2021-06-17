/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/


package Assignment4;

public class MyDate {
	
	// non-static private data members
	private int day;
	private int month;
	private int year;
	
	// Initialize the MyDate object with default value
	public void initDate()
	{
		this.day = 1;
		this.month = 1;
		this.year = 2021;
	}
	
	//Prints the MyDate object in form of dd/MM/yyyy
	public void printDate()
	{
		System.out.println(this.day+"/"+ this.month+"/" +this.year);
	}

}
