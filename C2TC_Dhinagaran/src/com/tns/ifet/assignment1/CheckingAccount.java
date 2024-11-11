package com.tns.ifet.assignment1;

public class CheckingAccount extends Account{
	private static final double OVERDRAFT_LIMIT = 100.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Checking Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
