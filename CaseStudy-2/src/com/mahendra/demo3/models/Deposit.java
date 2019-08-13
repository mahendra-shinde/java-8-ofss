package com.mahendra.demo3.models;

import com.mahendra.demo3.InterestCalculator;

public class Deposit implements InterestCalculator{
	protected Customer customer;
	protected int id;
	protected double amount;
	protected double roi;
	protected int duration;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Deposit(Customer customer, int id, double amount, double roi, int duration) {
		super();
		this.customer = customer;
		this.id = id;
		this.amount = amount;
		this.roi = roi;
		this.duration = duration;
	}
	@Override
	public double calculate() {
		return amount*(roi/100/12) * duration;
	}
	
	@Override
	public void printInterest() {
		System.out.println("Interest earned: "+calculate());
	}
	
}
