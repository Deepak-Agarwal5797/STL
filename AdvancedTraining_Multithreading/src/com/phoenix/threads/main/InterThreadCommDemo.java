package com.phoenix.threads.main;

import com.phoenix.threads.DataPrnterThread;
import com.phoenix.threads.DataReciverThread;

public class InterThreadCommDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];
		Thread t1  = new DataReciverThread(arr);
		Thread t2 =  new DataPrnterThread(arr);
		
		t2.start();
		t1.start();
	}

}
