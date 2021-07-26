package com.phoenix.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1003,"Refrigirator","Lg",35600.00f));
		prodList.add(new Product(1004,"Laptop","Hp",30890.00f));
		prodList.add(new Product(1005,"Mobile","Motorola",45600.00f));
		prodList.add(new Product(1006,"Mobile","Lenovo",13600.00f));
		prodList.add(new Product(1007,"UHD TV","Sony",90600.00f));
	
		Stream<Product> prodStream =prodList.stream();
		Stream<Product> filteredStream = prodStream.filter(p-> p.getPrice()>20000.00f);
		List<Product> filterProductList=  filteredStream.collect(Collectors.toList());
		filterProductList.forEach(p-> System.out.println(p));
		
		
		System.out.println("\n");
		
		// stream pipeline 
		List<Product> products = prodList.stream().filter(p->p.getPrice()>31000.00f).collect(Collectors.toList());
		
		products.forEach(System.out::println);
		
		
		List<Float> priceList= prodList.stream().filter(p-> p.getPrice()>20000.00f)
				.map(product->product.getPrice())
				.collect(Collectors.toList());
		priceList.forEach(p-> System.out.println(p));
		
		// to count no of products in the list 
		// terminal opeartion 
		long priceCount = priceList.stream().count();
		System.out.println("No of Products in the list : " + priceCount);
		
		
		Product maxPrice = prodList.stream()
				.max( (p1,p2)-> p1.getPrice()>p2.getPrice()? 1:-1).get();
		
		System.out.println(maxPrice);
		
		// max price without product object
		Float maxPriceProduct= prodList.stream()
				.map(p->p.getPrice())
				.max((p1,p2)-> p1>p2?1:-1).get();
				
				
		System.out.println(maxPriceProduct);
		
		// min price without product object 
		Float minPriceProduct= prodList.stream()
				.map(p->p.getPrice())
				.max((p1,p2)-> p1>p2?-1:1).get();
				
				
		System.out.println(minPriceProduct);
		
	}

}
