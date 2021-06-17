package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee e1 = new Employee() ;
		
		// Manager reference
		e1 =new Manager();
		//e12.display();
		((Manager) e1).showIncentives();
		
		// Wage Emp
		e1 =new WageEmp();
		//e1.display();
		((WageEmp) e1).calculateWage();
		
		
	}

}
