package com.training.alstrom.dao;

import java.util.List;

import com.training.alstrom.model.Customer;

public interface CustomerDAO {
		
	public boolean saveCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public void updateCustomer(int oldCustomerId,String newMobileNumber,int newBalance);
	public List<Customer> getCustomer();
	public Customer getCustomer(int customerId);
	public List<Customer> getCustomer(String customerName);
	public boolean isCustomerExists(int customerId);

	public int transfer(int fromCustomerId, int toCustomerId, int amount);

}
