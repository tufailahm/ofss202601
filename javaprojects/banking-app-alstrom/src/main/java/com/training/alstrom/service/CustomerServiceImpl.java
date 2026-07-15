package com.training.alstrom.service;

import com.training.alstrom.model.Customer;

public class CustomerServiceImpl extends CustomerService implements PremiumBankServices,DematServices{

	@Override
	public int transfer(Customer fromCustomer, Customer toCustomer, int amount) {
		int frombal=fromCustomer.getBalance();
		fromCustomer.setBalance(frombal-amount);
		int tobal=toCustomer.getBalance();
		toCustomer.setBalance(tobal+amount);
		return toCustomer.getBalance();
	}

	@Override
	public void applyLoan() {
		
		System.out.println("Loan applied successfully");
		
	}

	@Override
	public void doKyc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyCharges() {
		// TODO Auto-generated method stub
		
	}

}
