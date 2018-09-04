package com.rocky.strategy;

public class Duck extends AbstractDuck {

	private FlyBehaviour fly;
	
	private QuackBehaviour quack; 
	
	public Duck() {
		fly = new wingFlyBehaviour();
		quack = new CanQuackBehaviour();
	}
	
	public void  setBehaviour (FlyBehaviour fly) {
		this.fly = fly;
	}
	
	public void setQuackBehaviour(QuackBehaviour quack) {
		this.quack = quack;
	}
	
	public void performFly() {
		fly.fly();
	}
	
	public void performQuack() {
		quack.quack();
	}
	

	@Override
	public void display() {
		System.out.println("I am a duck");
		
	}
	
	
}
