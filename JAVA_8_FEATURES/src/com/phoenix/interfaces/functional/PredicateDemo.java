package com.phoenix.interfaces.functional;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p = n1->n1>10;
		boolean b1 =p.test(12);
		System.out.println(b1);
		
		//  returns only true and false
		
		Predicate<String> p2=  n1-> n1.equals("Java");
		boolean b2 = p2.test("Java");
		System.out.println(b2);
		
		Consumer<String> c1 = s-> System.out.println(s);
		c1.accept("Deepak Agarwal");
		
		Consumer<Integer> c2 =n-> System.out.println(n);
		c2.accept(20);
		
		Supplier<Double> s1 =()->12.5;
		System.out.println(s1.get());
		
		Supplier<String> s2 =()->"Deepak Agarwal";
		System.out.println(s2.get());
		
		Supplier<ArrayList<Integer>> s3 = ArrayList::new;
		ArrayList<Integer> numList = s3.get();
		System.out.println(numList.size());
		
		Consumer<Integer> c4 = a-> numList.add(a);
		c4.accept(10);
		c4.accept(30);
		c4.accept(50);
		c4.accept(70);
		c4.accept(80);
		
		System.out.println(numList.size());

		Function<String,Integer> f1 = s-> Integer.valueOf(s);
		System.out.println(f1.apply("34000"));
		
		
		Supplier<Product> s5 = ()-> new Product(1234,"Camera","Nikon",345099.00f);
		Product product = s5.get();
		System.out.println(product.toString());
		
		Consumer<Product> c6 = prod->System.out.println(prod);
		
		Function<Product,Float> f7 = pri-> pri.getPrice();
		System.out.println(f7.apply(product));
		
		Function<Product,String> f8 = pri-> pri.getBrand();
		System.out.println(f8.apply(product));
		
		
		BiPredicate<Integer,Double> bip1 = (i,d)-> i>=d; 
		System.out.println(bip1.test(123, 123.90));		
		System.out.println(bip1.test(344,122.0));
		
		BiConsumer<Integer,String> bic1 = (i,s) ->{System.out.println(i +"\t" +s);};
		bic1.accept(123,"Deepak agarwal");
		bic1.accept(product.getId(),product.getName());
		
		
		BiFunction <String,Integer,Boolean> bif1 = (s,i)->{
				return s.equals(i);
					};
				
		System.out.println(bif1.apply("100", 100));
		
		UnaryOperator<String> u1 = s-> s.toUpperCase();
		System.out.println(u1.apply("deepak"));
		
		BinaryOperator<String> bio1 = (as1,as2)-> as1.concat(as2);
		System.out.println(bio1.apply("Deepak","Agarwal"));
		
	
		
	} 

}
