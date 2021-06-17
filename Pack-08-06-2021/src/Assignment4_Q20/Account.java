/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q20;

public class Account {
	
	//private non-static data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//static data members
	private static float interestRate;
	private static int count;
	
	
	// static block
	static {
		interestRate =0.07f;
	}
	
	//default constructor
	
	public Account()
	{
		Account.count++;
		this.accNo =1234;
		this.ownerName="Deepak";
		this.balance =1000;
		this.durationYears =1;
		System.out.println("In Default Constructor");
	}
	
	//parameterized constructor
	public Account(int accNo,String ownerName,double balance,float years)
	{
		Account.count++;
		this.accNo= accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = years;
	}

	// Getter and setter methods of non-static data members
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public float getDurationYears() {
		return durationYears;
	}

	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}

	//Getter and setter methods of static data members
	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}

	public static int getCount() {
		return count;
	}
	
	//calculate interest function 
	public void calculateInterest()
	{
		double si =   (this.balance*(1+(Account.interestRate*this.durationYears)));
		System.out.println("The Simple Interest is "+ si);
	}
	
	// prints details of record
	public void printDetails()
	{
		System.out.println("Owner Name:"+this.ownerName +"\tAccount No:" +this.accNo +"\tBalance: "+ this.balance +"\tInterest Rate: "
					+Account.interestRate +"\tDuration: " +this.durationYears);
	}
}
