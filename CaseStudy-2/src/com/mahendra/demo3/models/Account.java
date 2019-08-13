package com.mahendra.demo3.models;

import com.mahendra.demo3.InterestCalculator;

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
	
	public int hashCode() {
		return accountNo * 19;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof Account) {
			Account temp = (Account)obj;
			return temp.accountNo == this.accountNo;
		}
		else
			return false;
	}
	
	public String toString() {
		return accountNo + " "+ holderName;
	}
}
