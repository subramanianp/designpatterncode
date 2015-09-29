package com.spring.training.abstractfactory;

public abstract class Address {
	private int no;
	private String street;
	private String location;
	private String city;
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public abstract String getCountry();
	@Override
	public String toString() {
		return "Address [no=" + no + ", street=" + street + ", location="
				+ location + ", city=" + city + ", country="
				+ getCountry() + "]";
	}

	
}
