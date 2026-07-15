package com.training.alstrom.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.training.alstrom.model.Customer;
import com.training.alstrom.util.EntityManagerUtil;

public class CustomerDAOImpl implements CustomerDAO {

	EntityManager entityManager = EntityManagerUtil.getEntityManager();

	@Override
	public boolean saveCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.merge(customer);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		entityManager.getTransaction().begin();
		Customer customer = entityManager.find(Customer.class, customerId);
		customer.setCustomerId(customerId);
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
		return true;
	}

	//Update method to update mobileNumber and balance of a customer


	@Override
	public List<Customer> getCustomer() {
		//select * from customers;
		List<Customer> customers = 
				entityManager.createQuery("from Customer c",Customer.class).getResultList();
		return customers;
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return entityManager.find(Customer.class, customerId);
	}

	@Override
	public List<Customer> getCustomer(String customerName) {
		
		return entityManager.createQuery
				("from Customer c where customerName = '"+customerName+ "'", Customer.class).getResultList();
	
	}

	@Override
	public int transfer(int fromCustomerId, int toCustomerId, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		entityManager.getTransaction().begin();
		Customer customer = entityManager.find(Customer.class, customerId);
		entityManager.getTransaction().commit();

		if (customer == null)
			return false;
		else
			return true;
	}
	@Override
	public void updateCustomer(int oldCustomerId, String newMobileNumber, int newBalance) {
		entityManager.getTransaction().begin();
		Customer oldCustomer = entityManager.find(Customer.class, oldCustomerId);
		oldCustomer.setMobileNumber(newMobileNumber);
		oldCustomer.setBalance(newBalance);
		entityManager.getTransaction().commit();
		
	}

}
