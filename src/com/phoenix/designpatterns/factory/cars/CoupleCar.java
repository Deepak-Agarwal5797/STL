package com.phoenix.designpatterns.factory.cars;

public class CoupleCar extends Car {

	public CoupleCar() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of Couple Car");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Couple Car Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Couple Car Stoped");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Couple Car is running");
	}
	

}
