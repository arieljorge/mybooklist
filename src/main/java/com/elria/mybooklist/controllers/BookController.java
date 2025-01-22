package com.elria.mybooklist.controllers;

import com.elria.mybooklist.dto.BookMinDTO;
import com.elria.mybooklist.entities.Book;
import com.elria.mybooklist.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookMinDTO> findAll() {
        return bookService.findAll();
    }
}
