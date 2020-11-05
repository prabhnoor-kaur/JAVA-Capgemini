package com;

public class CurrentAccount extends Account {
	private double overdraft = 1000;
	CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}
		
	public void withdraw(double amount) {
		if (amount <= overdraft) {
			super.setBalance(getBalance() - amount);
				overdraft -= amount;
			}
		else {
			System.out.println("Overdraft limit reached");
			}
		}
	}