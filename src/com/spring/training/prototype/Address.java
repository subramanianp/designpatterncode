package com.spring.training.prototype;

public class Address implements Cloneable {
	private String location;
	private String city;
	public Address(String location, String city) {
		super();
		this.location = location;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
