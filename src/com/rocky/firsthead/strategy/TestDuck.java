package com.rocky.firsthead.strategy;

public class TestDuck {

	public static void main(String[] args) {
		Duck duck = new Duck();
//		duck.fly();//但是橡皮鸭不会飞，可以选择重写fly方法
		duck.performFly();
		duck.performQuack();
		duck.setBehaviour(new NotFlyBehaviour());
		duck.performFly();
		duck.setQuackBehaviour(new NotQuackBehaviour());
		duck.performQuack();
		duck.setBehaviour(new RocketFlyBehaviour());
		duck.performFly();
	}
}
