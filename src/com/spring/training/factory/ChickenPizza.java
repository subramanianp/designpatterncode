package com.spring.training.factory;

public class ChickenPizza implements Pizza {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Chicken";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800;
	}

}
