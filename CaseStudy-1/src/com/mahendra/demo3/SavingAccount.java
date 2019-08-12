package com.mahendra.demo3;

public class SavingAccount extends Account {
	private double minBalance;

		
	public SavingAccount(int accountNo, String holderName, double balance, double minBalance) {
		super(accountNo, holderName, balance);
		this.minBalance = minBalance;
	}

	@Override
	public double calculate() {
		return balance * (4/100/12);
	}
	
	
}
