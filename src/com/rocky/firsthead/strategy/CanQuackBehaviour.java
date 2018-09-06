package com.rocky.firsthead.strategy;

public class CanQuackBehaviour implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I am quacking");
	}

}
