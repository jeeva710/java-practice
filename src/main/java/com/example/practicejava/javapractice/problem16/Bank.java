package com.example.practicejava.javapractice.problem16;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    int customerId;
    String accountNumber;
    Account account;
    List<Account> accounts=new ArrayList<>();
    public void createAccount(String type,String name,double initialAmount){
        customerId=customerId++;
        accountNumber="ACC"+customerId;
        if("savings".equalsIgnoreCase(type)){
            account=new SavingsAccount(customerId, accountNumber, initialAmount, 5);
        }
        else{
            account=new CurrentAccount(customerId, accountNumber, initialAmount, 5000);
        }

        accounts.add(account);
    }
    public Account getAccountDetails(String accountNumber){
        for(Account acc:accounts){
            if(acc.accountNumber.equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }

    public void performTransaction(String accountNumber,String type,double amount) throws AccountNotFoundException,InvalidTransactionException{
        Account accountDetail=getAccountDetails(accountNumber);
        if(accountDetail!=null){
            if (type.equals("DEPOSIT")) {
                accountDetail.deposit(amount);
            } else if (type.equals("WITHDRAW")) {
                accountDetail.withdraw(amount);
            } else {
                throw new InvalidTransactionException("Invalid transaction type.");
            }
        }
        else throw new AccountNotFoundException("Account is not found");
    }
}
