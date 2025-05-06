package com.example.practicejava.javapractice.problem16;

public class CurrentAccount extends Account{
    double overDraftLimit;

    public CurrentAccount(int customerId, String accountNumber, double balance, double overDraftLimit) {
        super(customerId, accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
        }
        else throw new InsufficientBalanceException("Insufficient Balance");
    }
}
