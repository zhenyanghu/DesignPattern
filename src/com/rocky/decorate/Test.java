package com.rocky.decorate;

/**
 * Created by Rocky on 2018-09-04.
 */
public class Test {

	public static void main(String[] args) {
		Pancake tornCake = new TornCake();
		System.out.println(String.format("%s %s元", tornCake.getDesc(), tornCake.price()));
		Pancake roujiamo = new Roujiamo();
		roujiamo = new FiredEgg(roujiamo);
		roujiamo = new FiredEgg(roujiamo);
		roujiamo = new Ham(roujiamo);
		roujiamo = new MeatFloss(roujiamo);
		roujiamo = new Cucumber(roujiamo);
        //我好饿
        System.out.println(String.format("%s %s元", roujiamo.getDesc(), roujiamo.price()));

	}
}
