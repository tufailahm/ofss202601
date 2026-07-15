package com.training.alstrom.service;

import com.training.alstrom.model.Customer;

public abstract class CustomerService {
	
		public abstract int transfer(Customer fromCustomer,Customer toCustomer,int amount);
		
		public int getBalance(int customerId) {
			return 0;
		}
		public int getBalance(Customer customer,int customerId) {
			return customer.getBalance();
		}
}
