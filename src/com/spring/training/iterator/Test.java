package com.spring.training.iterator;

import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeListIntf list=new EmployeeList(3);
		list.addEmployee(new Employee(1, "Rajiv", "Developer"));
		list.addEmployee(new Employee(2, "Arjun", "Accountant"));
		list.addEmployee(new Employee(3, "Deva", "Developer"));
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Using enhanced for loop");
		for(Employee e:list){
			System.out.println(e);
		}
	}

}
