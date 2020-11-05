package com;

public class SavingAccount extends Account{

	final double minBalance;
	SavingAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		minBalance = 500;
	}

	public void withdraw(double amount) {
		if (super.getBalance() <= minBalance) {
			System.out.println("You cannot withdraw");
		}
		else {
			super.setBalance(super.getBalance() - amount);
		}
	}
}