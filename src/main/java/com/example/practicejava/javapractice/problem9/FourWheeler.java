package com.example.practicejava.javapractice.problem9;

public class FourWheeler extends Vehicle{
    int numberOfDoors;
    boolean hasAC;

    public FourWheeler() {
        super("honda", 2014, "diesel");
        System.out.println("This is Four Wheeler class Parameter less constructor");
    }

    public FourWheeler(int numberOfDoors, boolean hasAC) {

        this.numberOfDoors = numberOfDoors;
        this.hasAC = hasAC;
    }
}
