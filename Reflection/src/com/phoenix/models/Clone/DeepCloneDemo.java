package com.phoenix.models.Clone;

import com.phoenix.models.Date;
import com.phoenix.models.Product;

public class DeepCloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product(3402,"Laptop","HP",45000.00f,new Date(12,34,2000));
		System.out.println("Original Product: " +product);

		// Deep copying
		
		// get the clone of container object Product
		
		try {
			Product cloneProd = (Product) product.clone();
			System.out.println("Cloned Product :" +cloneProd);
			
			// get the clone of mfg date
			Date originalMfgDate = product.getMfgDate();
			
			Date cloneMfgDate = (Date) originalMfgDate.clone();
			product.setMfgDate(cloneMfgDate); // deep copying 
			
			cloneProd.getMfgDate().setDd(2001);
			System.out.println("Cloned Product :" +cloneProd);

			// no change happening in original product
			System.out.println("Original Product: " +product);

			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
