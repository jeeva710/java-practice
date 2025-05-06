package com.example.practicejava.javapractice.problem16;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String msg){
        super(msg);
    }
}
