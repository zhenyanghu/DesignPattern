package com.rocky.decorate;

public class Cucumber extends Condiment {

	private Pancake pancake;
	
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
