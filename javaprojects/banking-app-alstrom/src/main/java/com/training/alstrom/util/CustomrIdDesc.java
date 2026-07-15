package com.training.alstrom.util;

import java.util.Comparator;

import com.training.alstrom.model.Customer;

public class CustomrIdDesc implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.getCustomerId() > o2.getCustomerId())
			return -1;
		else
			return 1;
	}

}
