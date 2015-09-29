package com.spring.training.abstractfactory;

public class USAddressFactroy implements AddressFactory{

	@Override
	public Address createAddress() {
		// TODO Auto-generated method stub
		return new USAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new USPhoneNumber();
	}

}
