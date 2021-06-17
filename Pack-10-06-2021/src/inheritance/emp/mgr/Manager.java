package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee{
	
	private double incentives;
	
	//default constructor
	public Manager()
	{
		System.out.println("Default Constructor of Manager");
	}
	public Manager(int empId,String name,double salary,double incentives)
	{
	     super(empId,name,salary);
	     this.incentives =incentives;
	}
	
	// function to show incentives
	public void showIncentives()
	{
		System.out.println("Incentives: "+ this.incentives);
	}
	
	// overrides the display method
	public void display()
	{
		super.display();
	}
	
	public String toString()
	{
		return super.toString();
	}
	
}
