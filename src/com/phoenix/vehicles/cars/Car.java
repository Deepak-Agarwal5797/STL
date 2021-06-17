package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable ,Runnable
{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car starts");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stops");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car Moves");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car runs");
	} 

}
