package com.phoenix.collection.stack;

import java.util.ArrayDeque;

public class ArrayStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> deq =  new ArrayDeque<Integer>();
		deq.addLast(40);
		deq.addLast(20);
		deq.addLast(70);
		deq.addLast(10);
		deq.addLast(80);

		System.out.println("Top of stack: " + deq.peekLast());
		System.out.println("Pop the stack: " + deq.pollLast());
		System.out.println("Top of stack: " + deq.peekLast());

	} 

}
