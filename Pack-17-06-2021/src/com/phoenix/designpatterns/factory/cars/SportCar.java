package com.phoenix.designpatterns.factory.cars;

public class SportCar extends Car {

	public SportCar() {
		// TODO Auto-generated constructor stub
		System.out.println("Defualt Constructor of Sportss Car");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Sports Car Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sports Car Stoped");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Sports Car is running");
	}
}
