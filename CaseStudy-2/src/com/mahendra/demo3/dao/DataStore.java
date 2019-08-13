package com.mahendra.demo3.dao;

import java.util.HashMap;
import java.util.Map;

import com.mahendra.demo3.models.Account;
import com.mahendra.demo3.models.Card;
import com.mahendra.demo3.models.CreditCard;
import com.mahendra.demo3.models.CurrentAccount;
import com.mahendra.demo3.models.DebitCard;
import com.mahendra.demo3.models.SavingAccount;

public class DataStore {
	Map<Integer, Account> accounts = new HashMap<>();
	Map<Integer, Card> cards = new HashMap<>();
	
	//Sample Records
	public DataStore(){
		Account a1 =new SavingAccount(101, "Chris Evans", 1200, 300);
		Account a2 = new CurrentAccount(102, "Chris Hensworth", 3000, 4);
		Account a3 = new CurrentAccount(100, "Tom Holland", 3500, 4);

		accounts.put(101, a1);
		accounts.put(102, a2);
		accounts.put(100, a3);
		
		Card c1 = new DebitCard(a1, 1234999, "01/20");
		Card c2 = new CreditCard(a2, 1237888, "01/22", 16, 400000, 34000);
		
		cards.put(1234999, c1);
		cards.put(1237888, c2);
	}
	
	public Map<Integer, Account> getAccounts() {
		return accounts;
	}
	public Map<Integer, Card> getCards() {
		return cards;
	}
	
	
}
