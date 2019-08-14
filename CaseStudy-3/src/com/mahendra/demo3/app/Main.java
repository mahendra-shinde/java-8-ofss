package com.mahendra.demo3.app;

import com.mahendra.demo3.dao.AccountDAO;
import com.mahendra.demo3.dao.CardDAO;
import com.mahendra.demo3.dao.DataStore;
import com.mahendra.demo3.models.Account;
import com.mahendra.demo3.models.Card;
import com.mahendra.demo3.models.CreditCard;
import com.mahendra.demo3.models.SavingAccount;

public class Main {
public static void main(String[] args) {
	DataStore store = DataStore.getStore();
	
	AccountDAO dao1 = new AccountDAO(store);
	CardDAO dao2 = new CardDAO(store);
	
	System.out.println("Load existing records...");
	store.load();
	System.out.println("List of accounts");
	for(Account a: dao1.getAll()) {
		System.out.println(a);
	}
	System.out.println("List of cards ");
	for(Card c : dao2.getAll()) {
		System.out.println(c);
	}
	
	Account a1 =new SavingAccount(102,"Abcd",10000,1000);
	dao1.save(a1);
	
	dao2.save(new CreditCard(a1, 12399012, "02/22", 15, 200000, 23000));
	
	System.out.println("Write everything to file");
	store.save();
	
}
}
