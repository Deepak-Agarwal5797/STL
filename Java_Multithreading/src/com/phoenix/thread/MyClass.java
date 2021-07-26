package com.phoenix.thread;

import java.io.Serializable;

public class MyClass extends Thread implements Serializable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
		for(int i=0;i<5;i++)
		{
			System.out.println("Inside loop "+ i);
				Thread.sleep(100);
			System.out.println("Current Thread" + Thread.currentThread().getName());
		}
		}
		
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
