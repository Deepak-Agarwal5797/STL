package com.phoenix.thread.main;

import com.phoenix.thread.MyRunnable;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new MyRunnable();
		Thread t1= new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("Deepak");
		t2.setName("Agarwal");
		t1.start();
		t2.start();
	}

}
