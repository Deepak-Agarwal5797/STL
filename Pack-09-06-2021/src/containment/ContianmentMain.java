/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package containment;

import containment.date.MyDate;
import containment.emp.Employee;

public class ContianmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee();
		employee1.setEmpId(1);
		employee1.setName("Deepak");
		employee1.setBirthDate(new MyDate(2,3,2021));
		
		int id= employee1.getEmpId();
		String name = employee1.getName();
		MyDate d =employee1.getBirthDate();
		
		System.out.println("Employee details\n"+employee1);
		
		Employee employee2= new Employee(2,"Deepak",new MyDate(4,5,1990));
		employee2.display();
	}

}
