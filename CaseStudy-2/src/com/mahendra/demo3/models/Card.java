package com.mahendra.demo3.models;

public abstract class Card {
	private Account account;
	private int cardNo;
	private String expiry;
	
	public Card(Account account, int cardNo, String expiry) {
		super();
		this.account = account;
		this.cardNo = cardNo;
		this.expiry = expiry;
	}
	
	public String toString() {
		return cardNo+" "+expiry;
	}

	public Account getAccount() {
		return account;
	}

	public int getCardNo() {
		return cardNo;
	}

	public String getExpiry() {
		return expiry;
	}
	
	
}
