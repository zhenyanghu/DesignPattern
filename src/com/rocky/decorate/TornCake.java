package com.rocky.decorate;

/**
 * Created by Rocky on 2018-09-04.
 */
public class TornCake extends Pancake {

	public TornCake() {
		super.desc = "手抓饼";	
	}
	
	@Override
	public double price() {
		return 4;
	}

}
