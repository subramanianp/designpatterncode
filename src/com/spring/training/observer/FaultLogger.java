package com.spring.training.observer;

public class FaultLogger implements FaultListener{

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("Writing to logfile "+message);
		
	}

}
