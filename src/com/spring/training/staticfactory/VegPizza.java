package com.spring.training.staticfactory;

public class VegPizza implements Pizza{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Veg";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500;
	}

}
