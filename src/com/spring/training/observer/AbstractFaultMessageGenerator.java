package com.spring.training.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFaultMessageGenerator {
	protected List<FaultListener> list=new ArrayList<>();
	public abstract void addFaultListener(FaultListener listener);
	public abstract void removeFaultListener(FaultListener listener);
	public abstract  void faultOccured(String message);

}
