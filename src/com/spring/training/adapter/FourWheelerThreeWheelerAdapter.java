package com.spring.training.adapter;

public class FourWheelerThreeWheelerAdapter implements FourWheeler{
	private ThreeWheeler threeWheeler;
	
	
	
	public FourWheelerThreeWheelerAdapter(ThreeWheeler threeWheeler) {
		super();
		this.threeWheeler = threeWheeler;
	}



	@Override
	public void travel() {
		// TODO Auto-generated method stub
		threeWheeler.travel();
	}

}
