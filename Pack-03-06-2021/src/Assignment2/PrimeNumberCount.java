/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 3-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment2;

import java.util.Scanner;

public class PrimeNumberCount {

	public static void primeCount(int count)
	{
		int i,j,dummyCount =0;
		System.out.print("1" +" ");
		for( i=1;dummyCount<count-1;i++)
		{
            for(j=2; i%j!= 0;j++);
            
            if(i==j)
            {
            	System.out.print(i +" ");
            	dummyCount++;
            }
           
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in); // Scanner defined for input
		
		int count  = scan.nextInt();
		
		//function called for prime series generator with void return type 
		primeCount(count);
		scan.close();
	}

}
