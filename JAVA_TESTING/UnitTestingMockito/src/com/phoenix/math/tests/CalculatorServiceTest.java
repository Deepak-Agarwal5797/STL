package com.phoenix.math.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.phoenix.math.Calculator;
import com.phoenix.math.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	private CalculatorService calcService;
	
	private Calculator calculator;
	
	@Before
	public void init()
	{
		//calcService= Mockito.mock(CalculatorService.class);  // will use refelction api 
	
	
		//calcService =Mockito.spy(new CalculatorService(new Calculator()));
	
		//using mcok annotation
		
	
	}
	
	@Test
	public void testAddition()
	{
		Mockito.when(calcService.addition(10, 20)).thenReturn(300);
		
		// creating behavior on real method 		
		//Mockito.when(calcService.addition(10, 20)).thenCallRealMethod();
		
		
		assertEquals(300, calcService.addition(10, 20));
	}
	
	@After
	public void clean()
	{
		calcService=null;
	}
}
