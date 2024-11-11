package com.tns.ifet.assignment1;

public class Transaction {
	 // Final variable for transaction fee
    private static final double transactionFee = 2.0;

    // Final method to perform a transaction
    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
        applyTransactionFee(account);
    }

    // Final method to apply the transaction fee
    private final void applyTransactionFee(Account account) {
        account.withdraw(transactionFee);
    }
}
