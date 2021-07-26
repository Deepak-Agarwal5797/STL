package com.phoenix.thread.main;

import java.util.ArrayList;
import java.util.List;

import com.phoenix.thread.ListThread1;
import com.phoenix.thread.ListThread2;

public class ListThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ciites=  new ArrayList<>();
		
		ciites.add("Delhi");
		ciites.add("Bombay");
		ciites.add("Jodhpur");
		
		Thread t1 =  new ListThread1(ciites);
		Thread t2 = new ListThread2(ciites);
		
		t1.start();
		t2.start();
		
		
		System.out.println(ciites);
		
	}

}
