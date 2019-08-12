package com.mahendra.demo3;

public class CreditCard extends Card {
	private double interestDue;
	private double maxLimit;

	public CreditCard(Account account, int cardNo, String expiry, double interestDue, double maxLimit) {
		super(account, cardNo, expiry);
		this.interestDue = interestDue;
		this.maxLimit = maxLimit;
	}

}
