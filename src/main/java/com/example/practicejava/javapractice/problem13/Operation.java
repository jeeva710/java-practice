package com.example.practicejava.javapractice.problem13;

public class Operation implements Addition,Subtraction,Division,Multiplication{
    public int additionTwoNumbers(int n1,int n2){
        return n1+n2;
    }
    public int subtractTwoNumbers(int n1,int n2){
        return n1-n2;
    }
    public int multiplyTwoNumbers(int n1,int n2){
        return n1*n2;
    }
    public int divideTwoNumbers(int n1,int n2){
        return n1/n2;
    }
}
