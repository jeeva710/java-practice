package com.example.practicejava.javapractice.problem15;

public class Cheese extends CustomPizza{
    int price;
    public Cheese(Pizza pizza,int price){
        super(pizza);
        this.price=price;
    }
    public int getPrice(){
            return price;
    }
    public String getDetails(){
        return pizza.getDetails()+" topped with Cheese";
    }
}
