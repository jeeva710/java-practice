package com.example.practicejava.javapractice.problem11;

public class Product {
    private int id;
    private String name;
    public Product(){}
    public Product(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }



}
