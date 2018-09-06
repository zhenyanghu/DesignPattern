package com.rocky.firsthead.strategy;

public class RubberDuck extends AbstractDuck {

	
	public void fly() {
		System.out.println("I can not fly");
	}
	
	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}

}
