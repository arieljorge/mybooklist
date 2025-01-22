package com.elria.mybooklist.services;

import com.elria.mybooklist.dto.BookMinDTO;
import com.elria.mybooklist.entities.Book;
import com.elria.mybooklist.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//@Service is same as @Component, just to know
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookMinDTO> findAll() {
        List<Book> bookMap = bookRepository.findAll();
        return bookMap.stream().map(BookMinDTO::new).collect(Collectors.toList());
    }
}
