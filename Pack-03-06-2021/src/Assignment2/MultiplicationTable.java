/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 3-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void mulTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n +" * " +i +" = " +(n*i));
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
		
		mulTable(n);
		scan.close();
	}
}
