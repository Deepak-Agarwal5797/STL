package com.phoenix.comparators;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductIdComparator<T> implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub

		
		
		  if(o1.getId()>o2.getId()) return 1;
		  else if(o1.getId()<o2.getId()) return -1;
		  else return 0;
	}
}
