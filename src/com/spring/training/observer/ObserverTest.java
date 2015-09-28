package com.spring.training.observer;

import java.util.Observable;
import java.util.Observer;

class FaultMessageGenerator extends Observable{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		setChanged();
		notifyObservers(message);
	}

}

class FaultApplicationLogger implements Observer{

	@Override
	public void update(Observable o, Object message) {
		// TODO Auto-generated method stub
		System.out.println("Writing to log file "+message);
		
	}
	
}

class FaultApplicationMailer implements Observer{

	@Override
	public void update(Observable o, Object message) {
		// TODO Auto-generated method stub
		System.out.println("sending mail "+message);
		
	}
	
}



public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaultMessageGenerator generator=new FaultMessageGenerator();
		generator.addObserver(new FaultApplicationLogger());
		generator.addObserver(new FaultApplicationMailer());
		generator.setMessage("Network Failure");

	}

}
