package com.spring.training.prototype;

public class Customer implements Cloneable{
	private int id;
	private String name;
	private double balance;
	private Address address;
	
	
	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance
				+ ", address=" + address + "]";
	}



	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer customer=(Customer) super.clone();
		customer.setAddress((Address)address.clone());
		return customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

	

}
