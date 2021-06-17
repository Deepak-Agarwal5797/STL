package com.phoenix.shapes.squares;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {

	public static void showEmpInfo(Employee e1)
	{
		if(e1 instanceof Manager)
		{
			System.out.println("Manager Type");
			((Manager) e1).display();
			// special methods
		}
		else if(e1 instanceof WageEmp)
		{
			System.out.println("Wage Emp type");
			((WageEmp) e1).display();
			
		}
	}
	
	public static void main(String args[])
	{
		Manager m1 =  new Manager(1,"Deepak Agarwal",20000,2000);
		showEmpInfo(m1);
		
		WageEmp e1 =  new WageEmp(2,"Deepak",100,100);
		showEmpInfo(e1);
	}
	
}
