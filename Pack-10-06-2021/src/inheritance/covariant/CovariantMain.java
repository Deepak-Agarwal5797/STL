package inheritance.covariant;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {
	
	public static void main(String[] args)
	{
		EmployeeData e1= new EmployeeData();
		Employee emp1 = e1.getEmployee();
		System.out.println(emp1);
		
		System.out.println("\nManager ");
		ManagerData m1 =new ManagerData();
		Manager man1 = m1.getEmployee();
		man1.showIncentives();
		man1.display();
		
		System.out.println("\nEmployee");
		WageEmpData w1 = new WageEmpData();
		WageEmp wag1 = w1.getEmployee();
		wag1.display();
		
	}
	
	
}

