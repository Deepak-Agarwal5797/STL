package com.phoenix.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Deque<Integer> deq= new LinkedList<Integer>();
		
		// arrayDeque can also bbe used 
		Deque<Integer> deq= new ArrayDeque<Integer>();
		
		
		deq.add(100);
		deq.add(200);
		deq.addFirst(150);
		deq.addFirst(180);
		deq.addLast(120);
		deq.addLast(130);

		System.out.println(deq.peek());
		System.out.println(deq.peekFirst());
		System.out.println(deq.peekLast());
		
		System.out.println("Polling element: " +deq.poll());
	}

}
