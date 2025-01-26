package com.elria.mybooklist.controllers;

import com.elria.mybooklist.dto.BookDTO;
import com.elria.mybooklist.dto.BookMinDTO;
import com.elria.mybooklist.projections.BookMinProjection;
import com.elria.mybooklist.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}")
    public BookDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @GetMapping(value = "/")
    public List<BookMinDTO> findByTitle(@RequestParam("title") String title) { return bookService.findByTitle(title); }
}
