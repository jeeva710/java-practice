package com.example.practicejava.javapractice.problem7;

public class Main {
    public void executeAll() throws CloneNotSupportedException{
        Author author=new Author(10,"jeeva");
        Book book1=new Book(1,"name1",author);
        Book book2=(Book) book1.clone();
        book2.author.authorName="jee";
        System.out.println(book1.author.authorName);
        System.out.println(book2.author.authorName);
    }
}
