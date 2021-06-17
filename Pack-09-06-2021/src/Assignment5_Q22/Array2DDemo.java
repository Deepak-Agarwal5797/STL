/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 9-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package Assignment5_Q22;

import java.util.Scanner;

public class Array2DDemo {

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
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Array with 2x4");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
