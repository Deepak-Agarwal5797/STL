/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q17;

public class MyDateP {

	// non-static int member
	private int day;
	private int month;
	private int year;
	
	//Default constructor
	MyDateP()
	{
		day= 1;
		month = 1;
		year =2021;
	}
	
	//Parameterized constructor
	MyDateP(int d,int m,int y)
	{
		day =d;
		month= m;
		year = y;
	}
	
	//Prints the object in dd/mm/yyyy format
	public void printDate()
	{
	
		System.out.println(day+"/"+month+"/"+year);
	}
	
}
