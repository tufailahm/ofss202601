package com.training;

public class PrintHello extends Thread {

	Thread t1;
	public PrintHello() {
		t1 = new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		System.out.println("1. Welcome in Dashboard : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
			new PrintHello();
			System.out.println("2. Hello Kirti , Welcome in App: "+Thread.currentThread().getName());
			
			Thread t2 = new Thread() {
				
				@Override
				public void run() {
					System.out.println("3. Welcome in Games are : "+Thread.currentThread().getName());

				}
			};
			t2.start();
	}	
}
