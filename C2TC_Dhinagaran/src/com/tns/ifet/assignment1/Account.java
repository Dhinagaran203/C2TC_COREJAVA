package com.tns.ifet.assignment1;

public abstract class Account {
	 protected double balance;

	    public Account(double initialBalance) {
	        this.balance = initialBalance;
	        Bank.incrementAccounts();
	    }

	    // Abstract methods for deposit, withdraw, and getBalance
	    public abstract void deposit(double amount);

	    public abstract void withdraw(double amount);

	    public abstract double getBalance();
}
