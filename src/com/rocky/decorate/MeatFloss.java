package com.rocky.decorate;

/**
 * Created by Rocky on 2018-09-04.
 */
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
