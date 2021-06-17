/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 10-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package com.phoenix.shapes;

public abstract class Shape {
	
	public static final double MATH_PI =3.14;
	
	// abstract method to find area
	public abstract void calculateArea();
	
	// abstract method to calculate perimeter
	public abstract void calculatePerimeter();
}
