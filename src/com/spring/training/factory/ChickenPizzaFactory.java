package com.spring.training.factory;

public class ChickenPizzaFactory extends PizzaFactory{

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new ChickenPizza();
	}

}
