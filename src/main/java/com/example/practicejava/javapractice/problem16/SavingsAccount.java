package com.example.practicejava.javapractice.problem16;

import javax.naming.InsufficientResourcesException;

public class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(int customerId, String accountNumber, double balance, double interestRate) {
        super(customerId, accountNumber, balance);
        this.interestRate = interestRate;
    }

    void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
        }
        else throw new InsufficientBalanceException("Insufficient Balance");
    }
}
