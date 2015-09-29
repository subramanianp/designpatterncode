package com.spring.training.builder;

public class CoffeeBuilder extends HotBevearageBuilder{

	@Override
	public HotBevearageBuilder buildLiquid() {
		// TODO Auto-generated method stub
		bevearage.setLiquid("Milk+Water");
		return this;
	}

	@Override
	public HotBevearageBuilder buildFlavour() {
		// TODO Auto-generated method stub
		bevearage.setFlavour("Coffee Powder");
		return this;
	}

	@Override
	public HotBevearageBuilder buildSweetener() {
		// TODO Auto-generated method stub
		bevearage.setSweetener("Sugar");
		return this;
	}

}
