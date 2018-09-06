package com.rocky.firsthead.strategy;

public class GreenHeadDuck extends AbstractDuck {

	private FlyBehaviour behaviour;
	
	public void setBehaviour(FlyBehaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	@Override
	public void display() {
		System.out.println("I am green head duck");
		
	}

}
