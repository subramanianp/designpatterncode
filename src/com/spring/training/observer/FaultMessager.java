package com.spring.training.observer;

public class FaultMessager implements FaultListener {

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("sending sms "+message);
		
	}

}
