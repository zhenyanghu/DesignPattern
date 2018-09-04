package com.rocky.decorate;

public class Ham extends Condiment {

	private Pancake pancake;
	
	public Ham(Pancake pancake) {
		this.pancake = pancake;
	}
	
	@Override
	public String getDesc() {
		return pancake.getDesc() + "+火腿片";
	}

	public double price() {
		return pancake.price() + 1.5;
	}

}
