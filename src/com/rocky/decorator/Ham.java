package com.rocky.decorator;

/**
 * Created by Rocky on 2018-09-04.
 */
public class Ham extends Condiment {
	
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
