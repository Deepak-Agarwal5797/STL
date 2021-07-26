package com.phoenix.designpatterns.factory.cars;

public class SedanCar extends Car {

	public SedanCar() {
		System.out.println("Sedan Car ");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Sedan Car Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sedan Car Stoped");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Sedan Car is running");
	}
	
}
