package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable moves = null;
		
		
		// Earth object 
		System.out.println("\n*******EARTH*****\n");
		moves = new Earth();
		((Planet) moves).setNoOfMoons(1);
		System.out.println(moves);
		((Earth) moves).revolve();
		((Earth) moves).rotate();
		System.out.println("Status of Life :" + ((Earth) moves).supportsLife());
		
		// Jupiter Object 
		System.out.println("\n*******JUPITER*****\n");
		moves = new Jupiter();
		((Planet) moves).setNoOfMoons(10);
		System.out.println(moves);
		((Jupiter) moves).revolve();
		((Jupiter) moves).rotate();
		System.out.println("Status of Life :" + ((Jupiter) moves).supportsLife());
		
		
		// tiger object 
		System.out.println("\n*******TIGER*****\n");
		moves  = new Tiger();
		((Tiger) moves).jump();
		((Tiger) moves).walk();
		moves.move();
		
		// cat object
		System.out.println("\n*******CAT*****\n");
		moves  = new Cat();
		((Cat) moves).jump();
		((Cat) moves).walk();
		moves.move();
		
		// Human Robot 
		System.out.println("\n*******HUMAN ROBOT*****\n");
		moves = new HumanRobot();
		((HumanRobot) moves).jump();
		((HumanRobot) moves).walk();
		moves.move();
	}

}
