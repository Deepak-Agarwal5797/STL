package com.phoenix.math.service;

import com.phoenix.math.Calculator;


// service class
public class CalculatorService {


	private Calculator calc;
	
	public CalculatorService()
	{
		
	}
	
	
	public CalculatorService(Calculator calc) {
		super();
		this.calc = calc;
	}

	// Application business logic
	public int addition (int a,int b)
	{
		return calc.add(a, b);
	}
	
	public int division (int a,int b)
	{
		return calc.divide(a, b);
	}
	
}
