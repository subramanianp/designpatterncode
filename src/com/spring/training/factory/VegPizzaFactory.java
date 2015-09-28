package com.spring.training.factory;

public class VegPizzaFactory extends PizzaFactory {

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new VegPizza();
	}

}
