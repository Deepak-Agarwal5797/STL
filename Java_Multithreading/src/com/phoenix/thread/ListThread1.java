package com.phoenix.thread;

import java.util.List;

public class ListThread1 extends Thread {

	List<String> cities;
	
	public ListThread1(List<String> cities)
	{
		super();
		this.cities= cities;
		
	}
	
	@Override
	public void run() {
		
		super.run();
		
		cities.set(1,"Tokyo");
		try {
			System.out.println("Thread 1" + cities);
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
}
