package com.spring.training.singletonwithserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company1=null,company2=null;
		try {
			FileInputStream fin=new FileInputStream("company.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			company1=(Company)oin.readObject();
			
			System.out.println(company1.getName());
			oin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		company1.setName("GE");
		System.out.println("Name of the company: "+company1.getName());
		try {
			FileInputStream fin=new FileInputStream("company.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			company2=(Company)oin.readObject();
			System.out.println(company2.getName());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(company1==company2);
		
	}

}
