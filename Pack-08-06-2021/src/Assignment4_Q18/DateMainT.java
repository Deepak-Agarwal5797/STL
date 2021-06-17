/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q18;

public class DateMainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object with default constructor
		MyDateP myDateP1 = new MyDateP();
		
		//Object with parameterized constructor
		MyDateP myDateP2 =  new MyDateP(3,4,2021);
		
		// Prints the contents in form of dd/mm/yyyy
		myDateP1.printDate();
		myDateP2.printDate();
	}

}
