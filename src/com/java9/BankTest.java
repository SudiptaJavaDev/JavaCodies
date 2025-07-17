package com.java9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double initialBalance = getValidAmount(scanner, "Enter the initial balance: ", 0.01, Double.MAX_VALUE);
            Bank bank = new SavingsAccount(initialBalance);
            
            // Deposit transaction
            double depositAmount = getValidAmount(scanner, "Enter the amount you want to deposit: ", 0.01, Double.MAX_VALUE);
            bank.executeTransaction("Deposit", depositAmount);
            
            // Withdraw transaction
            double withdrawAmount = getValidAmount(scanner, "Enter the amount you want to withdraw: ", 0.01, bank.getBalance());
            bank.executeTransaction("Withdraw", withdrawAmount);
            
            System.out.printf("\nFinal Balance: $%.2f%n", bank.getBalance());
            
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    
    /**
     * Gets a valid amount from the user within specified bounds
     * @param scanner Scanner object for user input
     * @param prompt Message to display to the user
     * @param min Minimum allowed value (inclusive)
     * @param max Maximum allowed value (inclusive)
     * @return Validated amount entered by the user
     */
    private static double getValidAmount(Scanner scanner, String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                double amount = scanner.nextDouble();
                
                if (amount < min) {
                    System.out.printf("Amount must be at least $%.2f. Please try again.%n", min);
                } else if (amount > max) {
                    System.out.printf("Amount cannot exceed $%.2f. Please try again.%n", max);
                } else {
                    return amount;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
