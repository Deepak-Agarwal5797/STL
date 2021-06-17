/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package containment.emp;

import containment.date.MyDate;

public class Employee {
	private int empId;
	private String name;
	private MyDate birthDate;
	
	public Employee()
	{
		
	}
	public Employee(int empId,String name, MyDate birthDate)
	{
		this.empId =empId;
		this.name = name;
		this.birthDate =birthDate;
	}
	
	//Getter and Setter 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void display()
	{
		System.out.println("Id: "+this.empId+"\tName: "+this.name +"\tBirth Date: "+this.birthDate);
		
	}
	public String toString()
	{
		return ("Id: "+this.empId+"\tName: "+this.name +"\tBirth Date: "+this.birthDate);
	}
	
	
}
