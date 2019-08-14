package com.mahendra.demo3.models;

public class SavingAccount extends Account {
	private double minBalance;

		
	public SavingAccount(int accountNo, String holderName, double balance, double minBalance) {
		super(accountNo, holderName, balance);
		this.minBalance = minBalance;
	}

	
	
}
