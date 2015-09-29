package com.spring.training.builder;

public class SugarFreeTeaBuilder extends HotBevearageBuilder{

	@Override
	public HotBevearageBuilder buildLiquid() {
		// TODO Auto-generated method stub
		bevearage.setLiquid("Milk+Water");
		return this;
	}

	@Override
	public HotBevearageBuilder buildFlavour() {
		// TODO Auto-generated method stub
		bevearage.setFlavour("Tea Powder");
		return this;
	}

	@Override
	public HotBevearageBuilder buildSweetener() {
		// TODO Auto-generated method stub
		bevearage.setSweetener("SugarFree");
		return this;
	}

}
