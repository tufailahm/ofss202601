package com.training;

public class Transfer extends Thread{
	
	public synchronized void  deposit(String name) {
		System.out.println("Customer "+ name+ " your  deposited started");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Customer "+ name+ " your  deposited finished");	
		//logging 
	}
	
	
	public static void main(String[] args) {
		
		Transfer transfer=new Transfer();
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				transfer.deposit("Nikhil");
			}
		};
		
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				transfer.deposit("Shreya");
			}
		};
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		
		t1.start();
		t2.start();
		
	}
	
	

}
