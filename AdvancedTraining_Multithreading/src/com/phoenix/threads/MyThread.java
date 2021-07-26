package com.phoenix.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				System.out.println("current thread: "+Thread.currentThread().getName());
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
