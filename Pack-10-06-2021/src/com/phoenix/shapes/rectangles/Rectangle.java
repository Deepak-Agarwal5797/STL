/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 10-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape {
	
	private int length;
	private int breadth;
	
	//default constructor
	public Rectangle()
	{
		System.out.println("Default Constructor of Rectangle");
	}
	
	//parameterized constructor
	public Rectangle(int length,int breadth)
	{
		System.out.println("Parameterized Constructor of Rectangle");
		this.length =length;
		this.breadth =breadth;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle :" +(this.length*this.breadth));

	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle :" +2*(this.length+this.breadth));
	}
	
	
}
