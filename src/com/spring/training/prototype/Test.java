package com.spring.training.prototype;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1=new Customer(1, "Rajiv", 8000);
		Address address1=new Address("Koramangala", "Bangalore");
		customer1.setAddress(address1);
		Customer customer2=null;
		try {
			 customer2=(Customer) customer1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer1==customer2);
		System.out.println(customer1.getAddress()==customer2.getAddress());
		

	}

}
