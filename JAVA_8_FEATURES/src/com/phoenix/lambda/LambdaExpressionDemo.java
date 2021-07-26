package com.phoenix.lambda;

import com.phoenix.interfaces.functional.Addable;
import com.phoenix.interfaces.functional.Greeting;
import com.phoenix.interfaces.functional.Jumpable;
import com.phoenix.interfaces.functional.Movable;

/*
*@author: deepak.agarwal@stltech.in
*
*
*
*/
public class LambdaExpressionDemo {

	
	public void doMath(Addable op)
	{
		System.out.println("Inside doMath function" +op.add(20, 30));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// lambda expression is the concrete implementation
		Movable  move = ()->System.out.println("Lambda Expression Movable");
		move.move();
		
		Jumpable  jump = ()->System.out.println("Lambda Expression Jumpable");
		jump.jump();
		
		
		Addable adder = (int x,int y)->{
											int res = x+y;
											return res;
										};
		int result =  adder.add(10,30);
		System.out.println(result);
	
		Greeting greet = str->{System.out.println("Welcome " +str);};
		greet.greet("Deepak");
		
		
		
		/// object of LambdaExpressionDemo;
		LambdaExpressionDemo obj = new LambdaExpressionDemo();
		obj.doMath( (c,d)->c+d  ); // passing function definition 
	}

}
