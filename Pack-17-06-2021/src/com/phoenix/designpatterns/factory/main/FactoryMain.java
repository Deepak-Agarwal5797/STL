package com.phoenix.designpatterns.factory.main;

import java.util.Scanner;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;


public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car =CarFactory.newCar(args[0]);
		car.start();
		car.stop();
		car.run();
		
	}

}
