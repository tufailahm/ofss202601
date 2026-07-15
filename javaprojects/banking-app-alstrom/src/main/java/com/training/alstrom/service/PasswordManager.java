package com.training.alstrom.service;

import com.training.alstrom.model.Customer;

//outer class
public class PasswordManager {

	int passwordExpiry=10;
	//inner class
	class ChangePassword
	{
			public void enterPassword() {
				//local inner class
				System.out.println("Password expired days : "+passwordExpiry);
				class ValidatePassword
				{
						
				}
			}
	}
	private class EncryptPassword
	{
		
	}
	//inner static class
	static class GeneratePassword
	{
		
	}
	public static void main(String[] args) {
		PasswordManager pw = new PasswordManager();
		ChangePassword changePassword = pw.new ChangePassword();
		changePassword.enterPassword();
		
	
		
		
	}
}
