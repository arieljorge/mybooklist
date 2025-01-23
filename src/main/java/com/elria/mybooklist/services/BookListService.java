package com.elria.mybooklist.services;

import com.elria.mybooklist.dto.BookListDTO;
import com.elria.mybooklist.entities.BookList;
import com.elria.mybooklist.repositories.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookListService {

    @Autowired
    private BookListRepository bookListRepository;

    @Transactional(readOnly = true)
    public List<BookListDTO> findAll() {
        List<BookList> bookLists = bookListRepository.findAll();
        return bookLists.stream().map(BookListDTO::new).collect(Collectors.toList());
    }
}
