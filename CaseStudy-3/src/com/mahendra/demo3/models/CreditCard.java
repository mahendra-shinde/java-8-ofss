package com.mahendra.demo3.models;

public class CreditCard extends Card  {
	private double interestDue;
	private double maxLimit;
	private double totalSpent;
	
	public CreditCard(Account account, int cardNo, String expiry, double interestDue, double maxLimit, double totalSpent) {
		super(account, cardNo, expiry);
		this.interestDue = interestDue;
		this.maxLimit = maxLimit;
		this.totalSpent= totalSpent;
	}


}
