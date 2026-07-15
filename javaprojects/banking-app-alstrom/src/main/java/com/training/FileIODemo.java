package com.training;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.training.alstrom.model.Customer;

public class FileIODemo {


	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Customer customer = new Customer(112,1212,"Aditya","1212123",560000000);
		File file = new File("records.dat");
		FileOutputStream fs = new FileOutputStream(file);
		ObjectOutputStream stream = new ObjectOutputStream(fs);
		stream.writeObject(customer);
		
		System.out.println("Customer Aditya Saved in a file");
		System.out.println(customer);
		stream.close();
	}
}
