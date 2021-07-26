package com.phoenix.math.tests;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.service.CalculatorService;

public class CalculatorServiceTest {

	private  static CalculatorService calcService;

	@BeforeClass
	public static void init()
	{
		calcService = new CalculatorService(new Calculator());
	}
	
	@Test    // test case method
	public void testAddition()
	{
		assertEquals(30,calcService.addition(10, 20));
		//assertNotEquals(expectedResult,actualResult);
		//assertSame(expectedResult, actualResult);
		
	}
	
	
	@Test    // test case method
	public void checkDivision()
	{
		assertEquals(2, calcService.division(10, 5));
		//assertNotEquals(expectedResult,actualResult);
	//	assertSame(expectedResult, actualResult);
		
	}
	
	@Test(expected = ArithmeticException.class)    // test case method
	public void checkDivisionByZeroException()
	{
		assertEquals(2, calcService.division(10, 0));
		//assertNotEquals(expectedResult,actualResult);
	//	assertSame(expectedResult, actualResult);
		
	}
	
	@AfterClass
	public static void cleanUp()
	{
		calcService= null;
	}
	
}
