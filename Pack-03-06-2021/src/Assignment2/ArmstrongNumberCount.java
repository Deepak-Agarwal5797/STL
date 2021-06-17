
/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 3-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment2;

import java.util.Scanner;

public class ArmstrongNumberCount {

	public static void armstrongCount(int count)
	{
		int dummyCount=0;
		int i=1,rem=0;
		while(dummyCount<count)
		{
			
			int temp = i;
	        int remainder = 0;
	        int sum = 0;
	        int n = 0;
	        // Get the total number of digits
	        n = (temp + "").length();
	        
	        // Check for Armstrong Number
	        while (temp != 0)
	        {
	            remainder = temp % 10;
	            sum = (int) (sum + Math.pow(remainder, n));
	            temp = temp / 10;
	        }
	        
	       
			if(i == sum)
			{
				dummyCount++;
				System.out.print(sum+ " ");
			}
		
			i++;
			sum=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		int count = scan.nextInt();
		
		armstrongCount(count);
		scan.close();

	}

}
