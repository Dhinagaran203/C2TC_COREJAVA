package com.tns.ifet.assignment1;

public class SavingsAccount extends Account{
	public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
