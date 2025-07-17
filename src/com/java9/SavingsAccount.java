package com.java9;

/**
 * A simple savings account implementation of the Bank interface.
 */
public class SavingsAccount implements Bank {
    private double balance;

    /**
     * Creates a new savings account with the specified initial balance.
     * @param initialBalance the initial account balance (must be non-negative)
     * @throws IllegalArgumentException if initialBalance is negative
     */
    public SavingsAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount{balance=%.2f}", balance);
    }
}
