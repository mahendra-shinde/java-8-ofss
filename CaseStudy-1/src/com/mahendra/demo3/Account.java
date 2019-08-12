package com.mahendra.demo3;

public abstract class Account implements InterestCalculator {
	protected int accountNo;
	protected String holderName;
	protected double balance;
	
	public Account(int accountNo, String holderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	
}
