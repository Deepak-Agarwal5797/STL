package com.phoenix.collection.stack;

import java.util.Stack;

public class NumStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Stack<Integer> stk =  new Stack<Integer>();
			stk.push(40);
			stk.push(20);
			stk.push(70);
			stk.push(10);
			stk.push(80);
			
			System.out.println(stk.peek());
			int ide = stk.search(70);
			System.out.println("Element 70 is found at index number " + ide);
			System.out.println("Pop number " + stk.pop());

			System.out.println(stk.peek());

			
	}

}
