package com.mahendra.demo3;

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
	
	
}
