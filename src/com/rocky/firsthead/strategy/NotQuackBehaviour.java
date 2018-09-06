package com.rocky.firsthead.strategy;

public class NotQuackBehaviour implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I can qucak");
	}

	
}
