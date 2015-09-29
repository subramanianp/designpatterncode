package com.spring.training.builder;

public abstract class HotBevearageBuilder {
	protected HotBevearage bevearage;
	
	public abstract HotBevearageBuilder buildLiquid();
	public abstract HotBevearageBuilder buildFlavour();
	public abstract HotBevearageBuilder buildSweetener();
	
	
	public HotBevearageBuilder createBevearage()
	{
		bevearage=new HotBevearage();
		return this;
	}
	public HotBevearage getBevearage()
	{
		return bevearage;
	}

}
