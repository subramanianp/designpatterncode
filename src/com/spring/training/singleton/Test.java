package com.spring.training.singleton;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company1=Company.getInstance();
		Company company2=Company.getInstance();
		System.out.println(company1.getName());
		
		System.out.println(company1==company2);

	}

}
