package com;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	Account(double balance, Person accHolder) {
		this.balance = balance;
		this.accHolder = accHolder;
		String genNum = Double.toString(Math.random()).substring(3,12);
		this.accNum = Long.parseLong(genNum);
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		}
		else System.out.println("Not enough funds");
	}
	
	
	public String toString() {
		return String.format("Person Details "+accHolder + " " + " Bank Details " + this.accNum + " " +this.balance);
	}
}
