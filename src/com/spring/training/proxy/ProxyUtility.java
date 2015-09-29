package com.spring.training.proxy;

public class ProxyUtility {
public static CustomerListIntf getProxy()
{
	return new CustomerListProxy();
}
}
