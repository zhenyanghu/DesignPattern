package com.rocky.decorate;

public class FiredEgg extends Condiment {

	private Pancake pancake;
	
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
