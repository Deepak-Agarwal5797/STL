package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	private int noOfMoons;
	
	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	
	protected abstract boolean supportsLife();
	
	public String toString()
	{
		return "No of Moons are :" +this.noOfMoons;
	}

}
