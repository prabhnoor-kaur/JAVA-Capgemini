package com;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Smith",22);
		Person p2 = new Person("Kathy",27);
		
		Account a = new Account(2000, p1);
		Account b = new Account(3000, p2);
		
		System.out.println(a);
		a.deposit(2000);
		System.out.println(a);
		System.out.println();
		System.out.println(b);
		b.withdraw(2000);
		System.out.println(b);
		
		SavingAccount s = new SavingAccount (3000, p1);
		CurrentAccount c = new CurrentAccount(4000, p2);
		System.out.println("Savings Account");
		System.out.println(s);
		s.withdraw(2700);
		s.withdraw(200);
		System.out.println(s);
		
		System.out.println("Current Account");
		System.out.println(c);
		c.withdraw(900);
		c.withdraw(200);
		System.out.println(c);
		
	}

}
