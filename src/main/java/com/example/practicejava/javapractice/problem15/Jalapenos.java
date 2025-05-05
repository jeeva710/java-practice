package com.example.practicejava.javapractice.problem15;

public class Jalapenos extends CustomPizza{
    int price;
    public Jalapenos(Pizza pizza,int price){
        super(pizza);
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public String getDetails(){
        return pizza.getDetails()+" topped with Jalapenos";
    }
}
