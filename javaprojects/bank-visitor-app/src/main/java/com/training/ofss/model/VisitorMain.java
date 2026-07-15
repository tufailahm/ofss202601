package com.training.ofss.model;

public class VisitorMain {

	public static void main(String[] args) {
		Visitor visitor = new Visitor(19191,"Vinusha","Training","1919189191");
		System.out.println(visitor);
		visitor.setMobileNumber("9876543211");
		System.out.println(visitor);

	}
}
