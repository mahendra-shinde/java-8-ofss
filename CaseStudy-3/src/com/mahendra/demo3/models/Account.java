package com.mahendra.demo3.models;

import java.io.Serializable;


public abstract class Account implements Comparable<Account> , Serializable{
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

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
