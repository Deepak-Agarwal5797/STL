package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape {

	private int side;
	
	//default constructor
	public Square()
	{
		System.out.println("Default constructor of Square");
	}
	
	// parameterized constructor
	public Square(int side)
	{
		System.out.println("Parameterized Constructor of Square");
		this.side =side;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of square :" +(this.side*this.side));
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of square :" +(4*this.side));

	}
	
}
