package inheritance.emp;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	// default constructor
	public Employee()
	{
		System.out.println("Default Constructor of Employee");
		this.empId=0;
		this.name="";
		this.salary =0;
	}
	
	//parameterized constructor 
	public Employee(int empId,String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	public Employee(int empId,String name,double salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary =salary;
	}
	
	protected void display()
	{
		System.out.println("Employee Display function \t "+" Employee Id: "+ this.empId
								+" Name: "+ this.name+ " Salary:" +this.salary);
	}
	
	public String toString()
	{
		 return ("Employee To String function \t "+" Employee Id: "+ this.empId
				+" Name: "+ this.name+ " Salary:" +this.salary);
	}
	
	
}
