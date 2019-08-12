package com.mahendra.demo3;

public abstract class Account {
	private int accountNo;
	private String holderName;
	private double balance;
	
	public Account(int accountNo, String holderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	
}
