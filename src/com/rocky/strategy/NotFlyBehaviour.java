package com.rocky.strategy;

public class NotFlyBehaviour implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can fly");
	}

}
