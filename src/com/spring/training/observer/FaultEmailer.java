package com.spring.training.observer;

public class FaultEmailer implements FaultListener {

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("sending email "+message);
		
	}

}
