package com.spring.training.builder;

public class Test {
	public static void main(String[] args) {
		Cook cook=new Cook();
		cook.setBuilder(new TeaBuilder());
		HotBevearage bevearage=cook.constructHotBevearage();
		System.out.println(bevearage);
		cook.setBuilder(new CoffeeBuilder());
		bevearage=cook.constructHotBevearage();
		System.out.println(bevearage);
	}

}
