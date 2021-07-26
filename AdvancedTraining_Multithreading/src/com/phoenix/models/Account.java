package com.phoenix.models;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

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

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	public synchronized void withdraw(double amount) throws InterruptedException {
		double currentBalance=getBalance();
		System.out.println("balnce before withdrawal "+ currentBalance
							+"seen by "+ Thread.currentThread().getName());
		currentBalance=currentBalance-amount;
		Thread.sleep(1000);
		setBalance(currentBalance);
		System.out.println("balnce after withdrawal "+ currentBalance
				+"seen by "+ Thread.currentThread().getName());
		Thread.sleep(1000);
	}
	
	public synchronized void Deposite(double amount) throws InterruptedException {
		double currentBalance=getBalance();
		System.out.println("balnce before Deposite "+ currentBalance
							+"seen by "+ Thread.currentThread().getName());
		currentBalance=currentBalance+amount;
		Thread.sleep(1000);
		setBalance(currentBalance);
		System.out.println("balnce after Deposite "+ currentBalance
				+"seen by "+ Thread.currentThread().getName());
		Thread.sleep(1000);
	}
	
}
