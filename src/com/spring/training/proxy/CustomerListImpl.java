package com.spring.training.proxy;

import java.util.HashMap;
import java.util.Map;

public class CustomerListImpl implements CustomerListIntf{
	private Map<Integer, Customer> list=new HashMap<Integer, Customer>();
	
	public CustomerListImpl()
	{
		list.put(1, new Customer(1, "Raju", 8000));
		list.put(2, new Customer(2, "Arjun", 9000));
		list.put(3, new Customer(3, "Amar", 6000));
	}

	@Override
	public Customer findCustomer(int id) {
		// TODO Auto-generated method stub
		return list.get(id);
	}

}
