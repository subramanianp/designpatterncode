package com.spring.training.buildermodified;

public  class HotBevearageBuilder {
	private  HotBevearage bevearage;
	
	public  HotBevearageBuilder addLiquid(String liquid)
	{
		if(bevearage.getLiquid()==null){
			bevearage.setLiquid(liquid);
		}
		else{
			bevearage.setLiquid(bevearage.getLiquid()+" + "+liquid);
		}
		return this;
	}
	public  HotBevearageBuilder addFlavour(String flavour)
	{
		if(bevearage.getFlavour()==null){
			bevearage.setFlavour(flavour);
		}
		else{
			bevearage.setFlavour(bevearage.getFlavour()+" + "+flavour);
		}
		return this;
		
	}
	public  HotBevearageBuilder addSweetener(String sweetener)
	{
		if(bevearage.getSweetener()==null){
			bevearage.setSweetener(sweetener);
		}
		else{
			bevearage.setSweetener(bevearage.getSweetener()+" + "+sweetener);
		}
		return this;
	}
	
	
	public HotBevearageBuilder   createBevearage()
	{
		bevearage=new HotBevearage();
		return this;
	}
	public HotBevearage build()
	{
		return bevearage;
	}

}
