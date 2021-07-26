package com.phoenix.collection;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1= Arrays.asList(10,20,30,40,50,80,90,60,70);
		l1.forEach(System.out::println);// method inference 
		/*
		 * l1.add(55); l1.remove(55);
		 * Not possible will throw an exception
		 * 
		 * replace method is allowed 
		 */
		
		
		System.out.println("\n");
		
		Integer [] intArr = new Integer[l1.size()];
		intArr = l1.toArray(intArr);
		for(int ele:intArr)
		{
			System.out.println(ele);
		}
		
		
		
	}

}
