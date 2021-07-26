package com.phoenix.lambda;

import com.phoenix.interfaces.functional.InstanceMethodClass;
import com.phoenix.interfaces.functional.Messaging;
import com.phoenix.interfaces.functional.Movable;
import com.phoenix.interfaces.functional.MyClass;
import com.phoenix.interfaces.functional.StringMerger;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		//static method refernce
		Movable m = MyClass::aMethod;
		m.move();
		
		//instance method reference on specific
		InstanceMethodClass ins =   new InstanceMethodClass();
		m = ins::InstanceFunction;
		m.move();
		
		// isntance method reference on arbitary object
		StringMerger sm =String::concat;
		System.out.println(sm.Merge("Hello","World"));
		

		
		 //constructor reference
		Messaging msg = Message::new; 
		Message m1=  msg.getObject("Deepak");
		System.out.println(m1.getMsg());
		
		
	}
}
