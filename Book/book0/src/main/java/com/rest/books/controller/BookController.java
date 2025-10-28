package com.rest.books.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rest.books.entity.Book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController // say spring boot 3, that this BookController is a rest file
public class BookController {

    private final List<Book> books = new ArrayList<>();

    public BookController() {
        initializeBooks(); 
    }

    private void initializeBooks() {
        books.addAll(List.of(
            new Book("Harry Potter", "J.K Rolling", "Fantasy"),
            new Book("When Nitzche wept", "I.D Yallom", "psycollogy"),
            new Book("Sapiens", "Y Noha Harari", "history")
        ));

    }

    @GetMapping("/api/books/") //get // to be able to call this func from web(postman, swagger, etc. we do local host 8080) // url: localhost:8080/api-endpoint
    public List<Book> getBooks() { 
        return books;
    }
}
