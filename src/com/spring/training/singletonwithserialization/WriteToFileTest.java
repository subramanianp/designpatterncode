package com.spring.training.singletonwithserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout=new FileOutputStream("company.dat");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			Company company1=Company.getInstance();
			company1.setName("Wipro");
			out.writeObject(company1);
			
			out.close();
			System.out.println("Object written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
