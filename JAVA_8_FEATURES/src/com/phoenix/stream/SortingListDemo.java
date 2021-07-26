package com.phoenix.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1003,"Refrigirator","Lg",35600.00f));
		prodList.add(new Product(1704,"Laptop","Hp",30890.00f));
		prodList.add(new Product(1015,"Mobile","Motorola",45600.00f));
		prodList.add(new Product(1006,"Mobile","Lenovo",13600.00f));
		prodList.add(new Product(1007,"UHD TV","Sony",90600.00f));
	
		Collections.sort(prodList);
		prodList.forEach(System.out::println);

		System.out.println("\n Natural Order");
		prodList.sort(Comparator.naturalOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("\n Reverse Order");
		prodList.sort(Comparator.reverseOrder());
		prodList.forEach(System.out::println);

		
		System.out.println("\n Sorting sing stream natural Order");
		prodList.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n Sorting sing stream Asending  Order");
		prodList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("\n Sorting sing stream By name Order");
		prodList.sort(Comparator.comparing(Product::getName));
		prodList.forEach(System.out::println);
		System.out.println("\n Sorting sing stream By name Order Desending ");
		prodList.sort(Comparator.comparing(Product::getName).reversed());
		prodList.forEach(System.out::println);


		System.out.println("\n Sorting sing stream By Price Order");
		prodList.sort(Comparator.comparing(Product:: getPrice));
		prodList.forEach(System.out::println);
		System.out.println("\n Sorting sing stream By Price Order Desending");
		prodList.sort(Comparator.comparing(Product:: getPrice).reversed());
		prodList.forEach(System.out::println);


		System.out.println("\n Sorting sing stream By Brand Order");
		prodList.sort(Comparator.comparing(Product::getBrand));
		prodList.forEach(System.out::println);
		System.out.println("\n Sorting sing stream By Brand Order Desending");
		prodList.sort(Comparator.comparing(Product::getBrand).reversed());
		prodList.forEach(System.out::println);

		
		System.out.println("\n Sorting sing stream By Name  Order and By Brand");
		prodList.sort(Comparator.comparing(Product::getName).thenComparing(Product ::getBrand ,(b1,b2)->b1.compareTo(b2)));
		prodList.forEach(System.out::println);

		System.out.println("\n Sorting sing stream By Name  Order and By Brand");
		prodList.sort(Comparator.comparing(Product::getName).thenComparing(Product ::getBrand ,(b1,b2)->b1.compareTo(b2)));
		prodList.forEach(System.out::println);

		
		
	}

}
