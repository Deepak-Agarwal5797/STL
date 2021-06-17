/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q21;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  =  new Scanner(System.in);
		int []a =  new int[5];
		int []b = {1,2,4,57,7};
		String[] city= new String[5];
		String[] hobbies = new String[5];
		System.out.println("Array with new Keyword");
		for(int i=0;i<5;i++)
		{
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Array without new Keyword");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("Array of Strings to stroe city names");
		for(int i=0;i<city.length;i++)
		{
			city[i] = scan.nextLine();
		}
		for(int i=0;i<city.length;i++)
		{
			System.out.println(city[i]);
		}
		
		System.out.println("Array to store Hobbies");
		for(int i=0;i<hobbies.length;i++)
		{
			hobbies[i] = scan.nextLine();
		}
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.println(hobbies[i]);
		}
		scan.close();
	}

}
