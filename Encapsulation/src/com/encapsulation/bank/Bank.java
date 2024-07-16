package com.encapsulation.bank;

public class Bank {
	private int totalAmount=100000;
	private int pin=5555;
	
	public Bank(int totalAmount,int pin) {
		this.pin=pin;
		this.totalAmount=totalAmount;
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	
	public int getPin() {
		return pin;
	}
	
}
