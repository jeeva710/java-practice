package com.example.practicejava.javapractice;

public class Author implements Cloneable{
    int authorId;
    String authorName;
    public Author(){

    }
    public Author(int authorId,String authorName){
        this.authorId=authorId;
        this.authorName=authorName;
    }

    protected Object clone() throws CloneNotSupportedException{
        return new Author(this.authorId,this.authorName);
    }

}
