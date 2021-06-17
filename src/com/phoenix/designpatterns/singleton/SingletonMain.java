package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n*******EARTH*****\n");
		Earth earth = Earth.newInstance();
		earth.createLife();
		Earth earth1 = Earth.newInstance();
		System.out.println("\n*******PRESIDENT*****\n");
		President.representNation();
		
		System.out.println("\n*******PRIME MINISTER*****\n");
		PrimeMinister.serveNation();
		
		System.out.println("\n*******SUN*****\n");
		Sun.giveLight();
	}

}
