package com.spring.training.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFaultMessageGenerator  extends AbstractFaultMessageGenerator{
	
	
	@Override
	public void addFaultListener(FaultListener listener) {
		// TODO Auto-generated method stub
		list.add(listener);
	}

	@Override
	public void removeFaultListener(FaultListener listener) {
		// TODO Auto-generated method stub
		list.remove(listener);
	}

	@Override
	public void faultOccured(String message) {
		// TODO Auto-generated method stub
		for(FaultListener listener:list){
			listener.handleFault(message);
		}
		
	}

}
