/*
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 3-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * */
package Assignment2;

import java.util.Scanner;

public class StringReverse {

	public static String stringReverse(String str)
	{
		char[]arr = str.toCharArray();
		char []rev = new char[str.length()];
		int j= str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			rev[j] = arr[i];
			j--;
		}
		String reverse =String.valueOf(rev);
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan  =  new Scanner(System.in);
		String str = scan.nextLine();
		
		String result = stringReverse(str);
		
		System.out.println("Reverse string is = " + result);
		
		scan.close();
	}

}
