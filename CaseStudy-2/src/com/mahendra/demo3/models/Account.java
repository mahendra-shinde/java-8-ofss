package com.mahendra.demo3.models;

import com.mahendra.demo3.InterestCalculator;

public abstract class Account implements InterestCalculator, Comparable<Account> {
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
	
	@Override
	public int compareTo(Account o) {
		/// return this.accountNo - o.accountNo;
		if(this.accountNo > o.accountNo) {
			return 1;
		}else if(this.accountNo < o.accountNo) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return accountNo + " "+ holderName;
	}
}
