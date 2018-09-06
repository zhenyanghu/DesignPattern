package com.rocky.docstudy.decorator;

/**
 * Created by Rocky on 2018-09-04.
 */
public class Roujiamo extends Pancake {

	public Roujiamo() {
		desc = "肉夹馍";
	}
	
	@Override
	public double price() {
		return 6;
	}

}
