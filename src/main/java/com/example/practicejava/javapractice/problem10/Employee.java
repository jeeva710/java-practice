package com.example.practicejava.javapractice.problem10;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private String firstName;
    private LocalDate dateOfBirth;
    private int salary;
    private String location;
    private String gender;


    public Employee() {
    }

    public Employee(String firstName, LocalDate dateOfBirth, int salary, String location, String gender) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.location = location;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
