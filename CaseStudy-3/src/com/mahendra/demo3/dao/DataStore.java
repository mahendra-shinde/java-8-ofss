package com.mahendra.demo3.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.mahendra.demo3.models.Account;
import com.mahendra.demo3.models.Card;
import com.mahendra.demo3.models.CreditCard;
import com.mahendra.demo3.models.CurrentAccount;
import com.mahendra.demo3.models.DebitCard;
import com.mahendra.demo3.models.SavingAccount;

public class DataStore {
	private static final String FILENAME = "data.dat";
	Map<Integer, Account> accounts = new HashMap<>();
	Map<Integer, Card> cards = new HashMap<>();
	
	//Private constructor
	private DataStore(){
	}
	
	private static DataStore store = new DataStore();
	
	public static DataStore getStore() {
		return store;
	}
	
	
	public Map<Integer, Account> getAccounts() {
		return accounts;
	}
	public Map<Integer, Card> getCards() {
		return cards;
	}
	
	/**
	 * Load data from binary files 
	 */
	public void load() {
		File file = new File(FILENAME);
		if(file.exists()) {
			
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
				//Read first object
				Object obj1 = in.readObject();
				if(obj1 instanceof Map) {
					accounts = (Map<Integer,Account>)obj1;
				}
				//Read second object
				Object obj2 = in.readObject();
				if(obj2 instanceof Map) {
					cards = (Map<Integer, Card>)obj2;
				}
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("No data file found!");
		}
	}
	
	/**
	 * Save data to binary files
	 */
	public void save() {
		File file = new File(FILENAME);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(accounts);
			out.writeObject(cards);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
