package com.phoenix.threads;

public class DataPrnterThread extends Thread{

	int arr[];
	
	public DataPrnterThread(int arr[])
	{
		super();
		this.arr=  arr;
		
	}
	
	@Override
	public void run()
	{
		synchronized(arr)
		{
			try {
				System.out.println("Waiting to print");
				arr.wait(20);
				for(int ele:arr)
				{
					System.out.println(ele);

					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
