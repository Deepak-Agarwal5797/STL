package com.phoenix.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream ins =IntStream.of(70,60,12,30,20);
		ins.forEach(System.out::println);
		/*
		 * System.out.println("Sorted in Ascending order");
		 * ins.sorted().forEach(System.out::println);
		 */
		/*
		 * System.out.println("Sorted in Descending order");
		 * ins.sorted().forEach(System.out::println);
		 */
		
		IntStream ins1= IntStream.iterate(1, i->i+1).limit(5);
		ins1.forEach(System.out::println);
		
		IntStream ins2 = IntStream.iterate(5, i->i+1).limit(25);
		ins2.forEach(System.out::println);
		
		
		//LongStream ls1 = LongStream.range(10L,15L); // for exclusive 15 
		LongStream ls1 = LongStream.rangeClosed(10L,15L); // inclusive of 15
		ls1.forEach(System.out::println);

	}

}
