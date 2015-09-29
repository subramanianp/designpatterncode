package com.spring.training.singletonwithserialization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Company implements Serializable {
	private static Company instance;
	private String name;
	
	static class Instance{
		 static Company company=new Company();
	}
	
	
	private Company()
	{
	}
	
	public static Company getInstance()
	{
		/*if(instance==null){
	synchronized(Company.class){
		if(instance==null){
			
				instance=new Company();
			
		}
		
	}*/
		return Instance.company;
	}
		
		
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*private void writeObject(ObjectOutputStream out) throws IOException
	{
		System.out.println("writing the object with name "+getName());
		out.defaultWriteObject();
	}*/
	
	
	private Object readResolve()
	{
		System.out.println("calling readResolve");
		/*synchronized(this){
		if(instance==null){
			instance=new Company();
		}
		}*/
	   instance=getInstance();
	   System.out.println(getName());
	   instance.setName(getName());
		return instance;
	}
	
}
