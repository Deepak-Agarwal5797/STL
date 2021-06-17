/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q19;

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Created 
		MyDateSG myDateDS = new MyDateSG();
		
		// setter functions to set the various fields
		myDateDS.setDay(8);
		myDateDS.setMonth(4);
		myDateDS.setYear(2021);
		
		// getter function to fetch the values 
		int date =  myDateDS.getDay();
		int month = myDateDS.getMonth();
		int year= myDateDS.getYear();
		
		System.out.println("After Getter methods of Object 1 "+ date+ "/" +month +"/"+ year);
	
		// Object created with Parameterized Constructor
		MyDateSG myDateSG2 = new MyDateSG(8,6,2021);
		
		//Getting the values 
		int date1 = myDateSG2.getDay();
		int month1 = myDateSG2.getMonth();
		int year1 = myDateSG2.getYear();
		
		System.out.println("After Getter methods of Object 2 " + date1+ "/" +month1 +"/"+ year1);
		
	
	}

}
