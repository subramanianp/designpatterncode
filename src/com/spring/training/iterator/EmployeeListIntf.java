package com.spring.training.iterator;

import java.util.Iterator;

public interface EmployeeListIntf  extends Iterable<Employee>{
	public void addEmployee(Employee e);
	//public Iterator<Employee> getIterator();

}
