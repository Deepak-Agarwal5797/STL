/**
 * Author :deepak.agarwal@stl.tech
 * Creation Date: 8-Jun-2021 
 * Version:1.0
 * Copyright :Sterlite Technologies Ltd.
 * **/

package Assignment4_Q16;

public class OverloadedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object created of type MathEngine
		MathEngine mathEngine = new MathEngine();
		
		// 1st version of multiply function
		int result1 = mathEngine.multiply(6, 4);
		System.out.println("Overload 1 = "+ result1);
		
		// 2nd version of multiply function
		mathEngine.multiply(2, 3, 4);
		
		//3rd version of multiply function
		float result2 = mathEngine.multiply(2,2.4f);
		System.out.println("Overload 3 = "+result2);
		
		//4th version of multiply function
		float result3 = mathEngine.multiply(2.3f, 5);
		System.out.println("Overload 4 = "+result3);
		
	}

}
