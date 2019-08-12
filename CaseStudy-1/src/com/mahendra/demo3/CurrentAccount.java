package com.mahendra.demo3;

public class CurrentAccount extends Account {
	private double interestDue;

	public CurrentAccount(int accountNo, String holderName, double balance, double interestDue) {
		super(accountNo, holderName, balance);
		this.interestDue = interestDue;
	}
	
	
}
