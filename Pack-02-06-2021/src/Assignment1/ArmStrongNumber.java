package Assignment1;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void armstrong(int num)
	{
		int initial= num;
		int sum =0;
		while(num!=0)
		{
			int rem = num%10;
			sum =  sum +(rem*rem*rem);
			num= num/10;
		}
		if(initial == sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			int n =  scan.nextInt();
			scan.close();
			armstrong(n);
	}

}
