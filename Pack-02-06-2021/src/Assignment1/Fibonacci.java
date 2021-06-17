package Assignment1;

import java.util.Scanner;

public class Fibonacci {

	public static void fibo(int terms)
	{
		int first =0;
		int second =1;
		if(terms==1)
		{
			System.out.println(first);
			return;
		}
		if(terms ==2)
		{
			System.out.print(first + ", " +second);
			return ;
		}
		else
		{
			System.out.print(first + ","+ second);
			for(int i=2;i<terms;i++)
			{
				int sum  = first+second;
				System.out.print(","+sum);
				first= second;
				second  = sum; 
				
			}
		}
		return;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		fibo(n);
		
		scan.close();
	}

}
