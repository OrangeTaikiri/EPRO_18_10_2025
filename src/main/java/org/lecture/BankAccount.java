package org.lecture;

/**
 * Represents a bank account with a specific holder's name and balance.
 * Provides methods for depositing and withdrawing funds, as well as printing the current balance.
 */
public class BankAccount {

    private final String holder;
    private double balance;

    /**
     * Constructs a new BankAccount with the specified holder's name and initial balance.
     *
     * @param holder the name of the account holder
     * @param balance the initial balance of the account
     */
    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    /**
     * Displays the current balance of the account along with the holder's name.
     * The balance is formatted to two decimal places.
     */
    public void printBalance() {
        System.out.printf("Balance for %s account is %.2f%n", holder, balance);
    }

    /**
     * Deposits the specified amount into the account and updates the balance accordingly.
     *
     * @param amount the amount to deposit into the account
     */
    public void deposit(double amount) {
       this.balance += amount;
       System.out.printf("Deposited %.2f to %s account%n", amount, holder);
    }

    /**
     * Withdraws an amount from the account. The amount must be a negative value
     * as it represents a withdrawal, and the balance will be adjusted accordingly.
     *
     * @param amount the amount to be withdrawn, must be a negative value
     */
    public void withdraw(double amount) {
        if ( amount < 0) {
            // += short-hand for balance = balance + amount
            this.balance += amount;
            System.out.printf("Withdrawn %.2f from %s account%n", amount, holder);
        } else {
            System.out.println("amount must be negative");
        }
    }

}
