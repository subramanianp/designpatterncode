package com.spring.training.observer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFaultMessageGenerator generator=new ConcreteFaultMessageGenerator();
		generator.addFaultListener(new FaultEmailer());
		generator.addFaultListener(new FaultLogger());
		generator.addFaultListener(new FaultMessager());
		generator.faultOccured("Network failure");

	}

}
