package com.tns.ifet.assignment1;

public class Bank {
	// Static variable to keep track of total accounts
    private static int totalAccounts = 0;

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Static method to increment total accounts
    public static void incrementAccounts() {
        totalAccounts++;
    }
}
