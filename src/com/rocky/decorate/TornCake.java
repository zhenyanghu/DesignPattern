package com.rocky.decorate;

public class TornCake extends Pancake {

	public TornCake() {
		super.desc = "手抓饼";	
	}
	
	@Override
	public double price() {
		return 4;
	}

}
