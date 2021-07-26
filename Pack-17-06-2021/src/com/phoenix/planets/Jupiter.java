package com.phoenix.planets;

public class Jupiter extends Planet {

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter revolves around sun");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter rotate around its axis");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Juupiter Moves around sun and moon");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return false;
	}

}
