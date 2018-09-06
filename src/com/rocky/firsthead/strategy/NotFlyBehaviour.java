package com.rocky.firsthead.strategy;

public class NotFlyBehaviour implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

}
