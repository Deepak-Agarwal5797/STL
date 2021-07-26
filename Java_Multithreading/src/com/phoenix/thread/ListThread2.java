package com.phoenix.thread;

import java.util.List;

public class ListThread2 extends Thread{

	List<String> cities;
	
	public ListThread2(List<String> cities)
	{
		this.cities = cities;
	}
	
	@Override
	public void run() {
		
		super.run();
		
		cities.set(1,"London");
		try {
			System.out.println("Thread 2" + cities);

			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
