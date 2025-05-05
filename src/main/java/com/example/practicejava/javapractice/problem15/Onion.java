package com.example.practicejava.javapractice.problem15;

public class Onion extends CustomPizza{
    int price;
    public Onion(Pizza pizza,int price){
        super(pizza);
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public String getDetails(){
        return pizza.getDetails()+" topped with Onion";
    }
}
