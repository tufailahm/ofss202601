package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.training.alstrom.model.Customer;
//reading object from file
public class FileIODemo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Customer customer = new Customer();
		File file = new File("records1.dat");
		FileInputStream fs = new FileInputStream(file);
		ObjectInputStream stream = new ObjectInputStream(fs);
		
		customer = (Customer) stream.readObject();

		System.out.println(customer);

		stream.close();
		
		}
}













