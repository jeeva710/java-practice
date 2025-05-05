package com.example.practicejava.javapractice.problem15;

public class ThinCruzPizza implements Pizza{
    int price;
    public ThinCruzPizza(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;

    }
    public String getDetails(){
        return "ThinCruzPizza";
    }
}
