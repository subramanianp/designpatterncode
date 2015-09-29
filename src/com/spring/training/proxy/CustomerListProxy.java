package com.spring.training.proxy;

import java.util.HashMap;
import java.util.Map;

public class CustomerListProxy  implements CustomerListIntf{
	private CustomerListIntf list=new CustomerListImpl();
	private Map<Integer, Customer> localCache=new HashMap<Integer, Customer>();
	
	
	@Override
	public Customer findCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer=null;
		if(localCache.containsKey(id)){
			System.out.println("Retrieving from cache");
			customer=localCache.get(id);
			
		}
		else{
			customer=list.findCustomer(id);
			localCache.put(id, customer);
		}
		return customer;
	}

}
