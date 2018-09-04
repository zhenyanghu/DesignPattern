package com.rocky.decorator;

/**
 * Created by Rocky on 2018-09-04.
 */
public class Cucumber extends Condiment {
	
	public Cucumber(Pancake pancake) {
		this.pancake = pancake;
	}
	
	@Override
	public String getDesc() {
		return pancake.getDesc() + "+黄瓜丝";
	}

	public double price() {
		return pancake.price() + 1;
	}
}
