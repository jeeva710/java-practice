package com.example.practicejava.javapractice.problem15;

public class Corn extends CustomPizza{
    int price;
    public Corn(Pizza pizza,int price){
        super(pizza);
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public String getDetails(){
        return pizza.getDetails()+" topped with Corn";
    }
}
