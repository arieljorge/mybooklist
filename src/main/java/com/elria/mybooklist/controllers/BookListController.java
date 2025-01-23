package com.elria.mybooklist.controllers;

import com.elria.mybooklist.dto.BookListDTO;
import com.elria.mybooklist.services.BookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class BookListController {

    @Autowired
    private BookListService bookListService;

    @GetMapping
    public List<BookListDTO> findAll() {
        return bookListService.findAll();
    }
}
