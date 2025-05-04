package com.example.practicejava.javapractice.problem16;

public abstract class Account {
    int customerId;
    String accountNumber;
    double balance;
    void deposit(double amount){
        balance+=amount;
    }
    abstract void withdraw(double amount);
}
