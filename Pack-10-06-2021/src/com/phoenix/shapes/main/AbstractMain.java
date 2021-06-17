/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 10-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1;
		
		// calling circle from base reference
		System.out.println("\t\t CIRCLE");
		s1 = new Circle(5.0f);
		s1.calculateArea();
		s1.calculatePerimeter();
		
		
		// calling rectangle from base reference
		System.out.println("\n\t\t RECTANGLE");
		s1 =new Rectangle(4,6);
		s1.calculateArea();
		s1.calculatePerimeter();
		
		//calling square from base reference
		System.out.println("\n\t\t SQUARE");
		s1 = new Square(5);
		s1.calculateArea();
		s1.calculatePerimeter();
	}
}