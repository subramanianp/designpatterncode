package com.spring.training.abstractfactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressFactory addressFactory=new IndianAddressFactory();
		Address address=addressFactory.createAddress();
		address.setNo(101);
		address.setStreet("G-10th Street");
		address.setLocation("Ulsoor");
		address.setCity("Bangalore");
		PhoneNumber phoneNumber=addressFactory.createPhoneNumber();
		phoneNumber.setPhoneNumber(9880372634L);
		System.out.println(address);
		System.out.println(phoneNumber);
		

	}

}
