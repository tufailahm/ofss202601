package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.alstrom.exception.NegativeBalanceException;
import com.training.alstrom.model.Customer;
import com.training.alstrom.service.CreditCard;
import com.training.alstrom.service.CreditCardHDFCImpl;
import com.training.alstrom.service.CreditCardImpl;
import com.training.alstrom.service.CustomerService;
import com.training.alstrom.service.CustomerServiceImpl;
import com.training.alstrom.service.MutualFund;
import com.training.alstrom.service.Portfolio;
import com.training.alstrom.util.CustomrIdDesc;

public class App {
	public static void main(String[] args) {
		System.out.println("---   Hello and welcome to ALSTROM BANKING APP----!");

		Customer customer1 = new Customer(1211, 11211, "Tufail", "12121212");
		Customer customer2 = new Customer(12122, 33, "Neha", "8867205331", 18000);
		Customer newCustomer = new Customer(1, 1223, "Yamini", "8867205331");
		Customer newCustomer1 = customer1;

		if (customer1.equals(newCustomer)) {
			System.out.println("Account can't be open , Already exists");
		} else {
			System.out.println("Congrats, Account Open suceessfully");
		}

		System.out.println("Current balance of customer 1 and customer 2 ");
		// print balance of both
		System.out.println(customer1.getBalance());
		System.out.println(customer2.getBalance());

		CustomerService service = new CustomerServiceImpl();
		int updatedBalance = 0;
		try {
			updatedBalance = service.transfer(customer1, customer2, 100);
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
		} finally {
			// closing
			System.out.println("DB CLOSE");
		}

		System.out.println("After Update - Current balance of customer 1 and customer 2 ");
		// print updated balance of both
		System.out.println(customer1.getBalance());
		System.out.println(updatedBalance);

		CreditCard cc = new CreditCardImpl();
		cc.issueCreditCard();

		cc = new CreditCardHDFCImpl();
		cc.issueCreditCard();

		CreditCard axis = new CreditCard() {

			@Override
			public void issueCreditCard() {
				System.out.println("Axis cc issued");
			}
		};
		axis.issueCreditCard();

		// hands on - SBI

		Portfolio portfolio = new Portfolio();
		portfolio.addPortfolio("MRF", 2, 1400000);

		MutualFund mf2 = new MutualFund() {

			@Override
			public void addPortfolio(String shareName, int shares, int value) {
				int total = shares * value;

				System.out.println(shareName + " shares of " + shares + " value of " + value + " = " + total);

			}
		};
		mf2.addPortfolio("OFSS", 2, 11500);

		// Use lambda expression to calculate the value of TATA

		MutualFund mf3 = (i, j, k) -> {
			System.out.println(i + " shares of " + j + " value of " + k + " = " + (j * k));
		};

		mf3.addPortfolio("TATA", 10, 88);

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(newCustomer);
		customers.add(customer1);
		customers.add(customer2);
		customers.add(new Customer(19171, 1222, "Nikhil", "191818181", 981));

		System.out.println(customers);

		Collections.sort(customers);
		System.out.println("After sorting -- ");
		System.out.println(customers);

		Collections.sort(customers, new CustomrIdDesc());
		System.out.println("After sorting customer id desc -- ");
		System.out.println(customers);

		// Lambda

		Comparator<Customer> accNumberDesc = (c1, c2) -> c1.getAccountNumber() > c2.getAccountNumber() ? -1 : 1;
		Collections.sort(customers, accNumberDesc);

		System.out.println("After sorting customer account number desc -- ");
		System.out.println(customers);
	}

}
