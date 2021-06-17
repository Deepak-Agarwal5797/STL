/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 3-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/


package Assignment2;

import java.util.Scanner;

public class CharCount {

	public static int countChar(String str, char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		System.out.println("Enter the char ");
		char ch= scan.next().charAt(0);
		int result = countChar(str,ch);
		System.out.println(result);
		scan.close();
	}

}
