/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q16;

public class MathEngine {
	//Overloading the multiply function
	
	// int,int as argument
	public int multiply(int a, int b) 
	{
		return a*b;
	}
	
	//int,int,int as argument
	public void multiply(int a,int b,int c) {
		System.out.println("Overload 2 = " +a*b*c);
	}
	
	//float,int as argument
	public float multiply(float a,int b) 
	{
		return a*b;
	}
	//int , float as argument
	public float multiply(int a,float b) {
		return (a*b);
	}
}
