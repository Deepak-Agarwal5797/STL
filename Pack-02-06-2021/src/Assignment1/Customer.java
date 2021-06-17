package Assignment1;

public class Customer {

	private int customerId;
	private String name;
	private int age;
	private String city;
	private int pinCode;
	public Customer()
	{
		
	}
	public Customer(int id, String name, int ag,String City, int pin)
	{
		this.customerId = id;
		this.city = City;
		this.age =ag;
		this.name=  name;
		this.pinCode =pin;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void printDetail()
	{
	
		System.out.println(this.customerId);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.city);
		System.out.println(this.pinCode);
	}
	
	
}
