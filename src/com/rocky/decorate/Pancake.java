package com.rocky.decorate;

public abstract class Pancake {

	protected String desc = "我不是一个具体的煎饼";
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double price();
		
}

