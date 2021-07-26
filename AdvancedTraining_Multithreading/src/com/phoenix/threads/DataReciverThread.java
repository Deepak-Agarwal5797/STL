package com.phoenix.threads;

import java.util.Scanner;

public class DataReciverThread extends Thread{

	int arr[];
	public DataReciverThread(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run()
	{
		synchronized(arr)
		{
		
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter Data: ");
				int data = sc.nextInt();
				arr[i]= data;	
			}
			arr.notify();
		}
		
	}
	
}
