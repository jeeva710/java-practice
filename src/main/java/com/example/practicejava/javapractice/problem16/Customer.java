package com.example.practicejava.javapractice.problem16;

public abstract class Customer {
    int customerId;
    String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }
}
