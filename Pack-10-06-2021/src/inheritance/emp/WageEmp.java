package inheritance.emp;

public class WageEmp extends Employee {
	
	private int noOfHours;
	private float ratePerHour;
	
	public WageEmp()
	{
		System.out.println("Default Constructor of WageEmp: ");
	}
	public WageEmp(int empId,String name,int hours,float rate)
	{
		super(empId,name);
		this.noOfHours =hours;
		this.ratePerHour = rate;
	}
	
	// calculating the wage
	public void calculateWage()
	{
		System.out.println("Wage :" + (this.noOfHours*this.ratePerHour));
	}
	
	public void display()
	{
		super.display();
	}
	
	public String toString()
	{
		return super.toString();
	}
	
}
