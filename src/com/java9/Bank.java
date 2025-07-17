package com.java9;
/*
In Java 8, we can provide method implementation in Interfaces using Default and Static methods.
However we cannot create private methods in Interfaces.
To avoid redundant code and more re-usability, Oracle Corp.
introduced private methods in Java SE 9 Interfaces.
From Java SE 9 on-wards, we can write private and private static methods too in an interface using ‘private’ keyword.
There are advantages of using private methods in an interface.
1. Reduced code duplication
2. Re-usability
3. Improved encapsulation by hiding implementation details
*/
public interface Bank {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    default void executeTransaction(String transactionType, double amount) {

        if (transactionType.equals("Deposit")) {
            deposit(amount);
            logTransaction(transactionType, amount);
        } else if (transactionType.equals("Withdraw") && sufficientBalance(amount)) {
            withdraw(amount);
            logTransaction(transactionType, amount);
        }
        else {
            System.out.println("Transaction Failed Insufficient Balance");
        }
    }

    private void logTransaction(String transactionType, double amount) {
        System.out.println("Transaction Type:"+transactionType);
        System.out.println("Amount:"+amount);
        System.out.println("Current Balance:"+getBalance());
    }

    private boolean sufficientBalance(double amount) {
        return getBalance() >= amount;
    }
}
