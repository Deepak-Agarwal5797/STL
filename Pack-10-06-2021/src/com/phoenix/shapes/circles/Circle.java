/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 10-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape{
	
	// data members
	private float radius;
	
	//default
	public Circle()
	{
		System.out.println("Defualt Constructor of Circle");
	}
	
	//parameterized constructor
	public Circle(float radius)
	{
		System.out.println("Parameterized Constructor of Circle");
		this.radius= radius;
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle :" +(MATH_PI*this.radius*this.radius));
	}
	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Circle :" +(2*MATH_PI*this.radius));
		
	}
	
}
