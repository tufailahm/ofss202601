package com.training.alstrom.model;

import java.io.Serializable;
import java.util.Objects;

import com.training.alstrom.exception.NegativeBalanceException;

public class Customer 
implements Comparable<Customer>,Serializable {

	private int customerId;
	private int accountNumber;
	private String customerName;
	private String mobileNumber;
	private transient int balance;

	@Override
	public int compareTo(Customer o) {
		if (this.getBalance() > o.getBalance())
			return -1;
		else
			return 1;
	}

	public Customer() {
		balance = 0;
	}

	public Customer(int customerId, int accountNumber, String customerName, String mobileNumber, int balance) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		if (balance < 0)
			throw new NegativeBalanceException("Balance cannot be negative");
		else
			this.balance = balance;
	}

	public Customer(int customerId, int accountNumber, String customerName) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public Customer(int customerId, int accountNumber, String customerName, String mobileNumber) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		if (balance < 0)
			throw new NegativeBalanceException("Balance cannot be negative");
		this.balance = 10000;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < 0)
			throw new NegativeBalanceException("Balance cannot be negative");
		else
			this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(accountNumber), Integer.valueOf(balance), Integer.valueOf(customerId),
				customerName, mobileNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return accountNumber == other.accountNumber && balance == other.balance && customerId == other.customerId
				&& Objects.equals(customerName, other.customerName) && Objects.equals(mobileNumber, other.mobileNumber);
	}

}
