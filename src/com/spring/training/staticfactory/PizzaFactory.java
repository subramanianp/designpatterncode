package com.spring.training.staticfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PizzaFactory {
	private static Properties properties=new Properties();
static{
	try {
		FileInputStream fin=new FileInputStream("pizza.properties");
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
	
	public static Pizza createPizza(String type)
	{
		Pizza pizza=null;
		/*if(type.equals("veg")){
			pizza=new VegPizza();
		}
		else if(type.equals("chick")){
			pizza=new ChickenPizza();
		}
			*/
		try {
			Class clz=Class.forName(properties.getProperty(type));
			pizza=(Pizza)clz.newInstance();
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
		return pizza;
	}
}
