package com.training;
//constructor
public class Customer {
		
		//member fields
		private int customerId;
		private String customerName;
		private int billAmount;
		
		public Customer() {
			customerId = -1;
			customerName = "NotAvailable";
			billAmount = 100;
		}
		public Customer(int customerId, String customerName) {
			this.customerId = customerId;
			this.customerName = customerName;
		}
		public Customer(int customerId, String customerName, int billAmount) {

			this.customerId = customerId;
			this.customerName = customerName;
			this.billAmount = billAmount;
		}

		public static void main(String[] args) {
			Customer ritika = new Customer();
			Customer karthik = new Customer(198,"Karthik",87000);
			Customer charu = new Customer(8171,"Charu");
			
			
		}
}
