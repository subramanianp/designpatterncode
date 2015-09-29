package com.spring.training.buildermodified;

public class Test {
	public static void main(String[] args) {
		HotBevearage tea=new HotBevearageBuilder().createBevearage()
											.addLiquid("Milk")
											.addLiquid("Water").addFlavour("Tea Powder").addFlavour("Ginger")
											.addSweetener("Sugar").build();
		System.out.println(tea);
		
	}

}
