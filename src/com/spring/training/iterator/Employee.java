package com.spring.training.iterator;

public class Employee {
	private int id;
	private String name;
	private String designation;
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation="
				+ designation + "]";
	}
	
	

}
