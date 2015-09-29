package com.spring.training.builder;

public class Cook {
	private HotBevearageBuilder builder;

	public void setBuilder(HotBevearageBuilder builder) {
		this.builder = builder;
	}
	
	public HotBevearage constructHotBevearage()
	{
		builder=builder.createBevearage().buildLiquid().buildFlavour().buildSweetener();
		return builder.getBevearage();
	}
}
