/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q24;

import java.util.Scanner;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= new int[3][3];
		int b[][] = {{2,3,4,5},{6,7,8,9}};
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Array with 3x3 ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		
		for(int []i:a)
		{
			for(int j:i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("Array with 2x4");
		for(int i[]:b)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	

}
