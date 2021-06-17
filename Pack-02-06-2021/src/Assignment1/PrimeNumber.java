package Assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static String prime(int num)
	{
		if(num==0|| num==1)
		{
			return "Not Prime";
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
					return "Not Prime";
		}
		
		return "isPrime";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String result =  prime(n);
		System.out.println(result);
		scan.close();
	}

}
