package com.example.practicejava.javapractice.problem7;

public class Book implements Cloneable {
    int bookId;
    String bookName;
    Author author;
    public Book() {

    }
    public Book(int bookId,String bookName,Author author) {
        this.bookId=bookId;
        this.bookName=bookName;
        this.author=author;
    }

    protected Object clone() throws CloneNotSupportedException{
        Book book=(Book) super.clone();
        book.author=(Author) author.clone();
        return book;
    }
}
