package com.spring.training.proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerListIntf customerList=ProxyUtility.getProxy();
		Customer c1=customerList.findCustomer(1);
		System.out.println(c1.getName()+" "+c1.getBalance());
		
		Customer c2=customerList.findCustomer(2);
		System.out.println(c2.getName()+" "+c2.getBalance());
		
		Customer c3=customerList.findCustomer(1);
		System.out.println(c3.getName()+" "+c3.getBalance());

	}

}
