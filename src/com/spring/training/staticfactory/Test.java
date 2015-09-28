package com.spring.training.staticfactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza=PizzaFactory.createPizza(System.getProperty("pizzaType"));
		System.out.println("Type: "+pizza.getType());
		System.out.println("Price: "+pizza.getPrice());

	}

}
