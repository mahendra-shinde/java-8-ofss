package com.mahendra.demo3.dao;

import java.util.ArrayList;
import java.util.List;

import com.mahendra.demo3.models.Account;
import com.mahendra.demo3.models.Card;

public class CardDAO {
	private DataStore store;

	public CardDAO(DataStore store) {
		super();
		this.store = store;
	}
	
	public List<Card> getAll(){
		return new ArrayList(store.getCards().values());
	}
	
	public Card findByCardNo(int cardNo) {
		return store.getCards().get(cardNo);
	}
	
	public void save(Card c) {
		int id =c.getCardNo();
		store.getCards().put(id,c);
	}
}
