package com.example.practicejava.javapractice.problem16;

public class InvalidTransactionException extends RuntimeException{
    public InvalidTransactionException(String msg){
        super(msg);
    }
}
