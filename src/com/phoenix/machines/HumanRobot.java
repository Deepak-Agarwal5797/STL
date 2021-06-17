package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Human Robot Jumps");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Human Robot Moves");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human Robot Walks");
	}

}
