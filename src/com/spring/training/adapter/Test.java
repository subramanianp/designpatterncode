package com.spring.training.adapter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FourWheeler fourWheeler=new Car();
		TravelUtility.goToOffice(fourWheeler);*/
		
		ThreeWheeler threeWheeler=new Auto();
		FourWheeler fourWheeler=new FourWheelerThreeWheelerAdapter(threeWheeler);
		TravelUtility.goToOffice(fourWheeler);

	}

}
