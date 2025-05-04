package com.example.practicejava.javapractice.problem8;

public class Vehicle {
    String model;
    int year;
    String fuelType;
    String color;
    int price;
    public Vehicle(){

    }
    public Vehicle(String model,int year,String fuelType){
        this.model=model;
        this.year=year;
        this.fuelType=fuelType;
    }

    public Vehicle(String model,int year,String fuelType,int price,String color){
        this.model=model;
        this.year=year;
        this.fuelType=fuelType;
        this.price=price;
        this.color=color;
    }


}
