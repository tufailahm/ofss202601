package com.training;

public class DBConnect {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("Mysql Driver loaded successfully");
	}
}
