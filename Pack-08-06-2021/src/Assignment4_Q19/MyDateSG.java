/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q19;

public class MyDateSG {

	// private data fields
	private int day;
	private int month;
	private int year;
	
	//default constructor
	MyDateSG()
	{
		
	}
	
	//parameterizedd constructor
	MyDateSG(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	// Setter methods of non- static data 
	public void setDay(int d)
	{
		day =d;
	}
	public void setMonth(int m)
	{
		month =m;
	}
	public void setYear(int y)
	{
		year= y;
	}
	
	
	//Getter methods of non-static data
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	
	//Prints in dd/mm/yyyy format
	public void printDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
	
	
	
}
