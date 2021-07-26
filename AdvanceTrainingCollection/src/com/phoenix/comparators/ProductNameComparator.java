package com.phoenix.comparators;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductNameComparator<T> implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub

		String name1= o1.getName();
		String name2= o2.getName();
		return name1.compareTo(name2);
		
	}

}
