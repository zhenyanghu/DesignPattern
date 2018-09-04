package com.rocky.strategy;

/**
 * 1.行为各种各样，容易改变，封装起来
 * 2.多用组合， 少用继承
 * 
 * @author lrnovo
 *
 */
public abstract class AbstractDuck {
	
//	public void fly() {
//		System.out.println("I am flying");
//	}
//	
//	public void swimming() {
//		System.out.println("I am swimming");
//	}
	
	/**
	 * 每次加新的方法都要在每个子类中重写相关的方法，（多用组合，少用继承）
	 */
	public void quack() {
		System.out.println("gagaga....");
	}
	
	public abstract void display();
}
