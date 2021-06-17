/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objects Created of MyDate type 
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		
		// Initialized the object using initDate() method
		date1.initDate();
		date2.initDate();
		
		//Printed contents of objects in dd/mm/yyyy format
		date1.printDate();
		date2.printDate();
	}

}
