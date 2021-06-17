package Assignment1;

import java.util.Scanner;

public class Factorial {

	public static int fact(int num)
	{
		int product=1;
		if(num<0)
		{
			System.out.println("Not Possible");
			return  num;
		}
		else if(num==0)
		{
			return 1;
		}

		else
		{
			
			for(int i=1;i<=num;i++)
			{
					product = product*i;
			}
		}
		return product;
		
	}
	
	public static void main(String args[])
	{
		Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
			int result = fact(n);
				if(result>=0)
				System.out.println("Factorial is "+ result);
		
		scan.close();
	}
	
}
