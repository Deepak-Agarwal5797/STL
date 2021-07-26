package com.phoenix.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.CompareNum;
import com.phoenix.comparators.ProductBrandComparator;
import com.phoenix.comparators.ProductIdComparator;
import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.comparators.ProductPriceComparator;

public class ProductListDemo {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1002,"Mobile","Samsung",35000.0f));
		productList.add(new Product(1002,"Mobile","Samsung",65000.0f));
		productList.add(new Product(1006,"Laptop","Lenovo",34000.0f));
		productList.add(new Product(1005,"Refrigirator","Whirlpool",35600.0f));
		productList.add(new Product(1001,"UHD TV","Samsung",35060.0f));
		
		/*
		 * System.out.println("Before sorting"); for(Product product:productList) {
		 * System.out.println(product); } Collections.sort(productList);
		 * 
		 * System.out.println("Sorting in ascending "); for(Product product:productList)
		 * { System.out.println(product); }
		 * 
		 * 
		 * Collections.sort(productList,Collections.reverseOrder());
		 * System.out.println("Sorting desending order"); for(Product
		 * product:productList) { System.out.println(product); }
		 */
		
		
	
		Comparator<Product> cIr = new ProductIdComparator();
		System.out.println("\nSorting ascending order with ID");
		
		Collections.sort(productList,cIr); // new method
		//Collections.sort(productList,Collections.reverseOrder(cIr)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
		
		System.out.println("\nSorting descending order with ID");
		Collections.sort(productList,cIr.reversed()); // new method
		//Collections.sort(productList,Collections.reverseOrder(cIr)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
		
		
		// Sort byName
		
		Comparator<Product> cNr = new ProductNameComparator();
		
		System.out.println("\nSorting ascending order with Name");
		Collections.sort(productList,cNr); // new method
		//Collections.sort(productList,Collections.reverseOrder(cNm)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}

		System.out.println("\nSorting descending order with Name");
		Collections.sort(productList,cNr.reversed()); // new method
		//Collections.sort(productList,Collections.reverseOrder(cNm)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
		
		
		// Sort by Brand
		Comparator<Product> cBr = new ProductBrandComparator();
		
		System.out.println("\nSorting ascending order with Brand");
		Collections.sort(productList,cBr); // new method
		//Collections.sort(productList,Collections.reverseOrder(cNm)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
		
		System.out.println("\nSorting Descending order with Brand");
		Collections.sort(productList,cBr.reversed()); // new method
		//Collections.sort(productList,Collections.reverseOrder(cNm)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
		
		
		Comparator<Product> cPr = new ProductPriceComparator();

		System.out.println("\nSorting ascending order with Price");
	
		Collections.sort(productList,cPr); // new method
		//Collections.sort(productList,Collections.reverseOrder(cNm)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
		System.out.println("\nSorting Descending order with Price");
		
		Collections.sort(productList,cPr.reversed()); // new method
		//Collections.sort(productList,Collections.reverseOrder(cNm)); // till 1.7 jdk old
		for(Product product:productList)
		{
			System.out.println(product);
		}
	}
	
}
