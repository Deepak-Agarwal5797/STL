package com.phoenix.thread.main;

import com.phoenix.thread.MyClass;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1= new MyClass(); // child thread of main thread 
		Thread t2 = new MyClass();
		
		t2.setPriority(2);
		t1.setPriority(8);
		t1.start();
		t2.start();
		
	}

}
