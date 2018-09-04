package com.rocky.decorate;

public class MeatFloss extends Condiment {

	private Pancake pancake;
	
	public MeatFloss(Pancake pancake) {
		this.pancake = pancake;
	}
	
	@Override
	public String getDesc() {
		return pancake.getDesc();
	}

	public double price() {
		return pancake.price() + 1;
	}

}
