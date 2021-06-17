package Assignment3;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String s)
	{
		char arr[] = new char[s.length()];
		for(int i=s.length()-1;i>=0;i--)
		{
			arr[i] = s.charAt(i);
		}
		
		System.out.println(arr);
		if(arr.toString().equals(s))
		return true;
		
		
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		boolean result = checkPalindrome(str);
		
		if(result==true)
			System.out.println("String is palindrome");
		
		else
			System.out.println("String is not palindrome");
		
		scan.close();
	}

}
