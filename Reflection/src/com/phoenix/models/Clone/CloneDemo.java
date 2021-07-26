package com.phoenix.models.Clone;

import com.phoenix.models.Date;
import com.phoenix.models.Product;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product(3402,"Laptop","HP",45000.00f,new Date(12,34,2000));
		
		
		try {
			Product cloneObj = (Product) p.clone();
			System.out.println("Cloned Object: " +cloneObj);
			
			
			cloneObj.getMfgDate().setDd(25);
			System.out.println("Cloned Object: " +cloneObj);
			//change will be refelcted in original also  /// shallow copy 
			System.out.println("Cloned Object: " +p);

			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
