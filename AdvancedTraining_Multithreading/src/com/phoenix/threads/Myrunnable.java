package com.phoenix.threads;

import java.util.ArrayList;
import java.util.List;

public class Myrunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("current thread: "+Thread.currentThread().getName());

		List<String> cities= new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Bengaluru");
		cities.forEach(System.out::println);

	}

}
