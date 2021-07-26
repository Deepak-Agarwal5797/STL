package com.phoenix.collection.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import com.phoenix.comparators.ProductIdComparator;
import com.phoenix.models.Product;

public class ProdctSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> productSet = new HashSet<Product>();
		
		// not duplicate because hash code is different
		productSet.add(new Product(1002,"Mobile","Samsung",35000.0f));
		productSet.add(new Product(1002,"Mobile","Samsung",35000.0f));
		productSet.add(new Product(1006,"Laptop","Lenovo",34000.0f));
		productSet.add(new Product(1005,"Refrigirator","Whirlpool",35600.0f));
		productSet.add(new Product(1001,"UHD TV","Samsung",35060.0f));
		
		
		System.out.println("Before sorting");
		for(Product product:productSet)
		{
			System.out.println(product);
		}
		
	}

}
