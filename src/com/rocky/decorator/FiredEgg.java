package com.rocky.decorator;

/**
 * Created by Rocky on 2018-09-04.
 */
public class FiredEgg extends Condiment {
	
	public FiredEgg(Pancake pancake) {
		this.pancake = pancake;
	}
	
	@Override
	public String getDesc() {
		return pancake.getDesc() + "+煎蛋";
	}

	public double price() {
		return pancake.price() + 2;
	}

}
