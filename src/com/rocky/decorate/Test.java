package com.rocky.decorate;

public class Test {

	public static void main(String[] args) {
		Pancake tornCake = new TornCake();
		System.out.println(String.format("%s %s元", tornCake.getDesc(), tornCake.price()));
		Pancake roujiamo = new Roujiamo();
		FiredEgg fireEgg = new FiredEgg(roujiamo);
		System.out.println(String.format("%s %s元", fireEgg.getDesc(), fireEgg.price()));
		Ham ham = new Ham(roujiamo);
		
	}
}
