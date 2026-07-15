package com.training;

import java.util.List;
import java.util.Scanner;

import com.training.alstrom.dao.CustomerDAO;
import com.training.alstrom.dao.CustomerDAOImpl;
import com.training.alstrom.model.Customer;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAOImpl();

		int choice;

		do {

			System.out.println("\n==============================");
			System.out.println("      CUSTOMER MENU");
			System.out.println("==============================");
			System.out.println("1. Add Customer");
			System.out.println("2. View all Customers");
			System.out.println("3. Update Customer");
			System.out.println("4. Delete Customer");
			System.out.println("5. Search Customer by name");
			System.out.println("6. Search Customer by id");
			System.out.println("7. Search Customer by mobileNumber");

			System.out.println("0. Exit");
			System.out.print("Enter Choice : ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Welcome in customer add section ----");
				Customer customer = new Customer();

				System.out.print("Enter Customer ID : ");
				customer.setCustomerId(sc.nextInt());

				System.out.print("Enter Account Number : ");
				customer.setAccountNumber(sc.nextInt());

				sc.nextLine(); // Consume newline

				System.out.print("Enter Customer Name : ");
				customer.setCustomerName(sc.nextLine());

				System.out.print("Enter Mobile Number : ");
				customer.setMobileNumber(sc.nextLine());

				System.out.print("Enter Balance : ");
				customer.setBalance(sc.nextInt());
				
				
				if(customerDAO.isCustomerExists(customer.getCustomerId()))
				{
					System.out.println("Customer already exists with this id");
				}
				else {
					customerDAO.saveCustomer(customer);
					System.out.println("Congrats for opening the account in our bank. You are few luckly ones");
				}
				// addCustomer();
				break;

			case 2:
				System.out.println("All the customers :\n"+customerDAO.getCustomer());
				break;

			case 3:
				// updateCustomer();
				break;

			case 4:
				System.out.println("Enter customer id to delete : ");
				int customerId = sc.nextInt();
				if (customerDAO.isCustomerExists(customerId)) {
					customerDAO.deleteCustomer(customerId);
					System.out.println("Customer deleted ");
				} else {
					System.out.println("Customer with id :" + customerId + " does not exists");
				}
				break;
			case 5:
				System.out.println("Enter customer name to find : ");
				String custName = sc.next();
				List<Customer> results = customerDAO.getCustomer(custName);
				if(results.size() ==0 )
				{
					System.out.println("No search result");
				}
				else
				{
					System.out.println(results);
				}
				break;

			case 6:
				System.out.println("Thank You...");
				break;

			default:
				System.out.println("Invalid Choice.");
			}

		} while (choice != 0);
	}

}
