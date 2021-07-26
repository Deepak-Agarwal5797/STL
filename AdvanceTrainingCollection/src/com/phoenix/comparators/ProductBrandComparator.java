package com.phoenix.comparators;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductBrandComparator <T> implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		String brand1= o1.getBrand();
		String brand2= o2.getBrand();
		return brand1.compareTo(brand2);
		
	
	}

}
