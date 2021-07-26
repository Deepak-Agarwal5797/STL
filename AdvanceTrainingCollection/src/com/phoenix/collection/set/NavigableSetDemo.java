package com.phoenix.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NAvigable set extends sorted set implemented by TRee set
		
		NavigableSet<Double> ns = new TreeSet<Double>();
		ns.add(5.6);
		ns.add(2.3);
		ns.add(5.67);
		ns.add(10.0);
		
		System.out.println("In Ascending order: " + ns);
		
		// Ceiling return the list of elements that are greater than or equal to user defined no
		// or null if not satisfy the condition --  output 10.0
		System.out.println("Greater than or qual to specified - celling : " + ns.ceiling(5.7));
	
		
		// floor maximum in less than or equal to element
		// or null if not satisfy the condition --  output 5.67
		System.out.println("Floor element (Max element that is less): " + ns.floor(9.0));
		
		
		// higher greater than in that minimum
		// or null if not satisfy the condition --  output 5.6
		System.out.println("higher strictly greater that no and minimun in that " + ns.higher(5.0));
		
	}

}
