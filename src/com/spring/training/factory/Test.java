package com.spring.training.factory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaFactory factory=PizzaFactory.newInstance("type1");
		Pizza pizza=factory.createPizza();
		System.out.println("Type: "+pizza.getType());
		System.out.println("Price: "+pizza.getPrice());

	}

}
