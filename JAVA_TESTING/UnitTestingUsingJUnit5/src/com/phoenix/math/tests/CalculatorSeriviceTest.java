package com.phoenix.math.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.service.CalculatorService;

class CalculatorSeriviceTest {

	private static CalculatorService calcService;

	@BeforeAll
	public static void init()
	{
		calcService = new CalculatorService(new Calculator());
	}
	
	@Test    // test case method
	public void testAddition()
	{
		int expectedResult= 30;
		int actualResult = calcService.addition(10, 20); //testing service Functionality
		assertEquals(expectedResult,actualResult);
		//assertNotEquals(expectedResult,actualResult);
		//assertSame(expectedResult, actualResult);
		
		
		
	}
	
	@Test    // test case method
	public void checkDivision()
	{
		int expectedResult= 2;
		int actualResult = calcService.division(10, 5); //testing service Functionality
		assertEquals(expectedResult,actualResult);
		//assertNotEquals(expectedResult,actualResult);
	//	assertSame(expectedResult, actualResult);
		
	}
	
	@Test
	public void checkDivideByZeroException()
	{
		assertThrows(ArithmeticException.class,()->calcService.division(10,0));
	}
	
	
	@AfterAll
	public static void cleanUp()
	{
		calcService= null;
	}
	
	
}
