package com.phoenix.models;

public class Product implements Comparable<Product>{

	
	private int id;
	private String name;
	private String brand;
	private float price;
	
	public Product()
	{
		
	}
	public Product(int id, String name, String brand, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		if(this.id<p.id)
			return -1;
		else if(this.id>p.id)
			return 1;
		else
			return 0;
		
	}
	
	
	
	
	  @Override public int hashCode() {
	  
	  // hashing key generated 
	  return id+name.hashCode()+ (int)price; }
	 
	@Override
	public boolean equals(Object obj) {
	
		if(!(obj instanceof Product))
		{
			return false;
		}
		else
		{
			Product p = (Product) obj;
			if(p.id==this.id && p.name.equals(this.name) && p.brand.equals(this.brand)&& this.price==p.price)
			{
				return true;
			}
			else
				return false;
		}
	}
	
	
	
}
