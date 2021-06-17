/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q26;

public class VarArgDemo {
	public static double average(int... avg)
	{
		int sum=0;
		for(int i:avg)
		{
			sum = sum+ i;
		}
		return (sum/avg.length);
	}
	
	public static void main(String args[])
	{
			double result1 = average(2,3);
			double result2 = average(4,5,6,89);
			System.out.println("Result is: "+result1);
			System.out.println("Result is: "+result2);
	}
}
