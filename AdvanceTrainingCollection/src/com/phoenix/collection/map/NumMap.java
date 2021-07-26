package com.phoenix.collection.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class NumMap {

	public static void main(String[] args) {
		
		//Map<Integer,String> m1=  new HashMap<Integer,String>();
		// un order and unsorted
		
		//Map<Integer,String> m1=  new LinkedHashMap<Integer,String>();
		// for insertion order of keys use  LinkedHashMap 
		
		Map<Integer,String> m1=  new TreeMap<Integer,String>();
		// for sorted use SortedMap --- sorts in Ascending or by some Comparator
		// TreeMap object;
		 m1.put(1,"Fisrt");
		 m1.put(2, "Two");
		 m1.put(3, "third");
		 Comparator<Integer> c = Collections.reverseOrder();
		 
		 
		System.out.println(m1);
	}
}
