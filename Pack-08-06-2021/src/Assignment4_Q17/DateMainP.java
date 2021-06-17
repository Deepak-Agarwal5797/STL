/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q17;

public class DateMainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object created - defualt constructor
		MyDateP myDateP1 = new MyDateP();
		
		// object created -  Parameterized constructor
		MyDateP myDateP2 = new MyDateP(8,6,2021);
		
		myDateP1.printDate();
		myDateP2.printDate();
	}

}
