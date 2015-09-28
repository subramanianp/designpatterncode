package com.spring.training.iterator;

import java.util.Iterator;

public class EmployeeList  implements EmployeeListIntf {
	private Employee[] employees;
	private int index;
	public EmployeeList(int size)
	{
		employees=new Employee[size];
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		employees[index++]=e;
	}

	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return new EmployeeListIterator(employees);
	}

}
