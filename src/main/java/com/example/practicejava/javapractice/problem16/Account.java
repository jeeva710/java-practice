package com.example.practicejava.javapractice.problem16;

public abstract class Account {
    int customerId;
    String accountNumber;
    double balance;

    public Account(int customerId, String accountNumber, double balance) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        balance+=amount;
    }
    abstract void withdraw(double amount);
}
