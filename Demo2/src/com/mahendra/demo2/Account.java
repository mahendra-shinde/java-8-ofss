package com.mahendra.demo2;

public class Account {
	private static int COUNT_ACCOUNTS = 0;

	//Accessor method
	public static int getCountAccounts() {
		return COUNT_ACCOUNTS;
	}
		
	private String holderName;
	private double balance;
	private int accountNo;
	
	public Account() {
		this(0,"Unset",0D); //Local Constructor Chaining
//		holderName="Unset";
//		accountNo=0;
//		balance=0;
	}

	public Account(int accountNo, String holderName, double balance) {
		// THIS to differentiate between LOCAL and INSTANCE vars
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.balance = balance;
		COUNT_ACCOUNTS++;
	}

	public void print() {
		System.out.println("Account details : " 
			+ accountNo + " Name: " 
			+ holderName + ", Balance: " + balance);
	}

}
