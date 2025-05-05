package com.example.practicejava.javapractice.problem15;

public class PanPizza implements Pizza{
    int price;
    public PanPizza(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;

    }
    public String getDetails(){
        return "PanPizza";
    }
}
