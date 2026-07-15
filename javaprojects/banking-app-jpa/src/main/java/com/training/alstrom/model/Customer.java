package com.training.alstrom.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "customers")
@Entity
@NamedQuery(name = "Customer_FindByAccNumber", 
			query = "from Customer where accountNumber = :accNumber")
public class Customer {

	@Id
	private int customerId;
	
	@Column
	private int accountNumber;
	
	@Column
	private String customerName;
	
	@Column
	private String mobileNumber;
	
	@Column
	private int balance;
	
	public Customer() {
		
	}

	public Customer(int customerId, int accountNumber, String customerName, String mobileNumber, int balance) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
		this.balance = balance;
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

	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", mobileNumber=" + mobileNumber + ", balance=" + balance + "]";
	}

}
