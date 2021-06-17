/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q23;

import java.util.Scanner;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan  =  new Scanner(System.in);
		double []a =  new double[5];
		float []b = {1.0f,2.9f,4.4f,57.4f,7.4f};
		String[] flowers= new String[5];
		String[] country = new String[5];
		System.out.println("Array with new Keyword");
		for(int i=0;i<5;i++)
		{
			a[i] = scan.nextDouble();
		}
		
		for(double g:a)
		{
			System.out.println(g);
		}
		
		System.out.println("Array without new Keyword");
		for(float f:b)
		{
			System.out.println(f);
		}
		
		System.out.println("Array of Strings to stroe Flowers names");
		for(int i=0;i<flowers.length;i++)
		{
			flowers[i] = scan.nextLine();
		}
		for(String str:flowers)
		{
			System.out.println(str);
		}
		
		System.out.println("Array to store Hobbies");
		for(int i=0;i<country.length;i++)
		{
			country[i] = scan.nextLine();
		}
		for(String str:country)
		{
			System.out.println(str);
		}
		scan.close();
	}

}
