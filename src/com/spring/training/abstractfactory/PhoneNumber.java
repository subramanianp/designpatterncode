package com.spring.training.abstractfactory;

public abstract class PhoneNumber {
	private long phoneNumber;

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public abstract String getIsdCode();

	@Override
	public String toString() {
		return getIsdCode()+"-"+phoneNumber;
	}
	
	
}
