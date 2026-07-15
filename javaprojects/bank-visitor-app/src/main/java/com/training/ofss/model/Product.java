package com.training.ofss.model;

import java.util.Date;

public class Product {
	private int productId=0		;
	private String	productName	;
	private int quantityOnHand	;
	private int price		;
	private String greetings = "Good morning";
	//instance / ANONYMOUS block
	{	
		System.out.println("3. INSTANCE BLOCK");
		productId = 1;
	}
	static 
	{
		System.out.println("3.       STATIC BLOCK");
	}
	public Product() {	
		System.out.println("4. DEF CONS  "+greetings);

		productId++;
	
	}
	public static void main(String[] args) {
		System.out.println("2.     MAIN CALLED");
		Product product1 = new Product();		//1, 2
		Product product2 = new Product(9191,"Earphone",12,99);
		
		System.out.println(product1);
		System.out.println(product2);

	}
	
	
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + ", greetings=" + greetings + "]";
	}
	public Product(int productId, String productName, int quantityOnHand, int price) {
		System.out.println("5. PARA CONS");
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	
	
}
