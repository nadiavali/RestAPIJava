package com.rest.books.entity;

public class Book {
    private String title;
    private String author;
    private String catechory;

    public Book(String title, String author, String catechory) {
        this.title = title;
        this.author = author;
        this.catechory = catechory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatechory() {
        return catechory;
    }

    public void setCatechory(String catechory) {
        this.catechory = catechory;
    }

    
    
}
