package com.example.practicejava.javapractice.problem15;

public abstract class CustomPizza implements Pizza {
    Pizza pizza;
    public CustomPizza(Pizza pizza){
        this.pizza=pizza;
    }
    public abstract int getPrice();
    public abstract String getDetails();

}
