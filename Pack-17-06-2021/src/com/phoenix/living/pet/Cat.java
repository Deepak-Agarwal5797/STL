package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;

public class Cat implements Walkable {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Cat jumps");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cat moves");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat walks");
	}

}
