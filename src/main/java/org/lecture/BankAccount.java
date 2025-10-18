package org.lecture;

public class BankAccount {

    private final String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }


    public void printBalance() {
        System.out.printf("Balance for %s account is %.2f%n", holder, balance);
    }

    public void deposit(double amount) {
       this.balance += amount;
       System.out.printf("Deposited %.2f to %s account%n", amount, holder);
    }

    public void withdraw(double amount) {
        if ( amount < 0) {
            this.balance += amount;
            System.out.printf("Withdrawn %.2f from %s account%n", amount, holder);
        } else {
            System.out.println("amount must be negative");
        }
    }






}
