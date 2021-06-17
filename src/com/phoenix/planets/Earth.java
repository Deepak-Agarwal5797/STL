package com.phoenix.planets;

public class Earth extends Planet {

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Earth revolves around sun");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Earth rotate around its axis");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Earth Moves around sun and moon");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}


}
