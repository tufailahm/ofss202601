package com.training.plist;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
		
	public static List<String> getProductList() {
		List<String> products = new ArrayList();
			products.add("Garnier");
			products.add("Nivea");
			products.add("Sprite");
			products.add("Mobile");
			return products;
	}
}