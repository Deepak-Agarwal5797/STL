package com.phoenix.designpatterns.factory.cars;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		// TODO Auto-generated constructor stub
		System.out.println("Defualt Constructor of Luxury Car");

	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Car Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Car Stoped");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Car is running");
	}

}
