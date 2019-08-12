package com.mahendra.demo2;

public class Account {

	private String holderName;
	private double balance;
	private int accountNo;

	public Account(int accountNo, String holderName, double balance) {
		// THIS to differentiate between LOCAL and INSTANCE vars
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
	}

	public void print() {
		System.out.println("Account details : " 
			+ accountNo + " Name: " 
			+ holderName + ", Balance: " + balance);
	}

}
