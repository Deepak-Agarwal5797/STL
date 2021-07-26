package com.phoenix.threads.main;

import com.phoenix.threads.Myrunnable;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r= new Myrunnable();
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);

		t1.setName("A");
		t2.setName("B");
//		t1.setPriority(2);
//		t2.setPriority(8);
		
		t1.start();
		t2.start();
		
		
	}

}
