package com.phoenix.queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Queue<Integer> numQ = new LinkedList<Integer>(); //FIFO or LiFO
		
		//Priority queue implements queue interface  
		//min element has highest priority and max have last priority 
		Queue<Integer> numQ = new PriorityQueue<Integer>(Collections.reverseOrder()); //FIFO or LiFO
		
		numQ.add(100);
		numQ.offer(150);
		numQ.offer(20);
		numQ.add(70);
		numQ.add(50);

		System.out.println(numQ.peek());
		
		int del =numQ.poll();
		System.out.println(del);
		System.out.println(numQ.peek());
		
		System.out.println("Removing Elements from queue");
		while(!numQ.isEmpty())
		{
			System.out.println(numQ.poll());
		}
		System.out.println("Elements in queue");
		System.out.println(numQ.peek());
		System.out.println(numQ.poll());
		
		// throws NOSuch element exception
		//System.out.println(numQ.remove());
		//System.out.println(numQ.element());
	}

}
