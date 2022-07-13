package com.bookstore.controller;


import com.bookstore.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save =>" + book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("function Geting all books is running");
        List<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setName("Spring introduction");
        book1.setType("Computer");
        book1.setDescription("this is the basic knowledge");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setType("Computer");
        book2.setName("SpringMVC introduction");
        book2.setDescription("this is the advanced course");
        bookList.add(book2);

        Book book3 = new Book();
        book3.setType("Computer");
        book3.setName("Mybatis introduction");
        book3.setDescription("this is the basic knowledge");
        bookList.add(book3);

        return bookList;

    }







}
