package com.phoenix.collection.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparators.CompareNum;

public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set<Integer> s = new HashSet<Integer>(); 
		/// linkedhashSet extends hashset 
		// linkedhashset ordered insertion pattern , unsorted, unique
	
		
		Set<Integer> s = new LinkedHashSet<Integer>(); 
		s.add(1200);
		s.add(100);
		s.add(90);
		s.add(34);
		s.add(34);
		s.add(500);
		
		System.out.println(s);
		
		
		
		// using Iterator
		System.out.println("using Iterator");
		Iterator<Integer> i1= s.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		// to sort SortedSet sub Interface
		
		TreeSet<Integer> ts= new TreeSet<Integer>();
		
		ts.add(100);
		ts.add(200);
		ts.add(456);
		ts.add(20);
		ts.add(10);
		
		// wil be stored in sorted order (ascending order)
		
		System.out.println("TreeSet: " + ts);
		// sort in reverse order
		
		//Collections.reverseOrder(ts);
		
		//NAvigable set extends sorted set implemented by TRee set
		// celling return the list of elements that are greater than or equal to user defined no
		// or null if not satisfy the condition
	}  

}
