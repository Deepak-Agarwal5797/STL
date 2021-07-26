package com.phoenix.services;


/*
 * @author: deepak.agarwal@stltech.in
 * verison 1.0;
 * 
*/

import com.phoenix.math.Calculator;

public class CalculatorService {

	private Calculator calculator;

	public CalculatorService(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}
	
	
	//bussiness logic
	public int addition(int a,int b)
	{
		return calculator.add(a, b);
	}
}
