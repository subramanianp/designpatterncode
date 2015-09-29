package com.spring.training.adapter;

public class TravelUtility {
	
	public static void goToOffice(FourWheeler f)
	{
		System.out.println("Starting");
		f.travel();
		System.out.println("Reached office");
	}

}
