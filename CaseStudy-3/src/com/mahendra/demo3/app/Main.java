package com.mahendra.demo3.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter account details: ");
	System.out.println("Account No: ");
	int accNo=0;
	String holderName=null;
	double balance=0;
	try {
		String s1 = br.readLine();
		accNo = Integer.parseInt(s1);
		System.out.println("Enter account holder name: ");
		holderName = br.readLine();
		System.out.println("Enter balance: ");
		String s2 = br.readLine();
		balance = Double.parseDouble(s2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Account a1 =new SavingAccount(accNo,holderName,balance,1000);
	dao1.save(a1);
	int cardNo=0;
	String exp=null;
	try {
		System.out.println("Enter card no ");
		String s3 = br.readLine();
		cardNo= Integer.parseInt(s3);
		System.out.println("expiry date");
		exp = br.readLine();
		
	}catch(IOException ex) {
		
	}
	dao2.save(new CreditCard(a1, cardNo, exp, 15, 200000, 23000));
	
	System.out.println("Write everything to file");
	store.save();
	
}
}
