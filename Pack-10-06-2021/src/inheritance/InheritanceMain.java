package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t\t\t Employee");
		Employee e1 = new Employee(1,"Deepak Agarwal",20000);
		//e1.display();
		System.out.println(e1);
		
		
		System.out.println("\n\t\t\t Manager");
		Manager m1 =new Manager();
		m1.showIncentives();
		m1.display();
		System.out.println(m1);
		
		Manager m2 = new Manager(2,"deepak",20000,2000);
		m2.showIncentives();
		m2.display();
		System.out.println(m2);
		
		System.out.println("\n\t\t\t Wage Employee");
		WageEmp w1= new WageEmp();
		w1.calculateWage();
		w1.display();
		System.out.println(w1);
		
		WageEmp w2 =new WageEmp(3,"deepak",50,100);
		w2.display();
		System.out.println(w2);
		
	}

}
