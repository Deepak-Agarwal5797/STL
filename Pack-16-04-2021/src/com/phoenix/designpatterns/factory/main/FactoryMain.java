package com.phoenix.designpatterns.factory.main;

import java.util.Scanner;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;


public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String charType = scan.nextLine();
		
		Car car =CarFactory.newCar(charType);
		car.start();
		car.stop();
		car.run();
		scan.close();
	}

}
