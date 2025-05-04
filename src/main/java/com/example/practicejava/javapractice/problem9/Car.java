package com.example.practicejava.javapractice.problem9;

public class Car extends FourWheeler{
    String model;
    String color;


    public Car() {
        super(4,true);
        System.out.println("This is Car class Parameter less constructor");
    }

    public Car(String brand, int year, String fuelType, int numberOfDoors, boolean hasAC, String model, String color) {

        this.model = model;
        this.color = color;
    }
}
