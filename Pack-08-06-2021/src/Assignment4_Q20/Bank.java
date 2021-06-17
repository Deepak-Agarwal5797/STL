/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q20;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initial interest printed;
		System.out.println("Interest: "+ Account.getInterestRate());
		
		//Object created and set the fields values
		Account account1 =  new Account();
		
		account1.setAccNo(1);
		account1.setBalance(4000);
		account1.setOwnerName("Deepak");
		account1.setDurationYears(2);
		Account.setInterestRate(0.07f);
		
		// Printing the object 1 details
		System.out.println("Owner Name :" +account1.getOwnerName());
		System.out.println("Account Number :"+ account1.getAccNo());
		System.out.println("Balance : "+ account1.getBalance());
		System.out.println("Duration :" +account1.getDurationYears());
		
		//Interest Calculated
		account1.calculateInterest();
		
		//Object created with parameterized constructor
		System.out.println("2nd Object\n");
		Account account2 =   new Account(2,"Deepak",5000,5);
		account2.printDetails();
		
		//No of objects created
		System.out.println("Noof objects created: " +Account.getCount());;
	}

}
