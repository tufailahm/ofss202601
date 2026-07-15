package com.training.alstrom.service;

public class CreditCardHDFCImpl implements CreditCard {

	@Override
	public void issueCreditCard() {
		//process by hdfc to issue cc
		System.out.println("HDFC CC issued");
		
	}

	@Deprecated
	public void issueCreditCard2() {
		//process by hdfc to issue cc
		System.out.println("HDFC CC issued");
		
	}
}
