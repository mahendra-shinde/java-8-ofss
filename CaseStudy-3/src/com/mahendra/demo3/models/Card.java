package com.mahendra.demo3.models;

import java.io.Serializable;

public abstract class Card implements Serializable{
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

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
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
