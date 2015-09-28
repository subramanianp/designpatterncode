package com.spring.training.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public abstract class PizzaFactory {
	private static Properties properties=new Properties();
	static{
		try {
			FileInputStream fin=new FileInputStream("pizzafactory.properties");
			properties.load(fin);
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static PizzaFactory newInstance(String type)
	{
		PizzaFactory factory=null;
		try {
			Class clz=Class.forName(type);
			factory=(PizzaFactory)clz.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Pizza createPizza();
	
		
}
	
	

