package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {

	public static Car newCar (String CarType) {
		// TODO Auto-generated constructor stub
		
		if(CarType.equals("Sedan"))
		{
			return new SedanCar();
		}
		else if(CarType.equals("Couple"))
		{
			return new CoupleCar();
		}
		else if(CarType.equals("Luxury"))
		{
			return new LuxuryCar();
		}
		else if(CarType.equals("Sports"))
		{
			return new SportCar();
		}
		else
		{
			return null;
		}
	}

}
