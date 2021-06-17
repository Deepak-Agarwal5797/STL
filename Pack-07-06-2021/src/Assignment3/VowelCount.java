/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 7-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment3;

import java.util.Scanner;

public class VowelCount {

	public static int countVowel(String str)
	{
		int count =0;
		char []arr = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			char ch = arr[i];
			if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = countVowel(str.toLowerCase());
		System.out.println("No of vowels is " +count);
	}

}
