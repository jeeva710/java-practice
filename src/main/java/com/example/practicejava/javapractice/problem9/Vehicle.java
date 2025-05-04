package com.example.practicejava.javapractice.problem9;

public class Vehicle {
    String brand;
    int year;
    String fuelType;

    public Vehicle() {
    System.out.println("This is Vehicle class Parameter less constructor");
    }

    public Vehicle(String brand, int year, String fuelType) {
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
    }
}
