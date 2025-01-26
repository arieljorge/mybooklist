package com.elria.mybooklist.services;

import com.elria.mybooklist.dto.BookDTO;
import com.elria.mybooklist.dto.BookMinDTO;
import com.elria.mybooklist.entities.Book;
import com.elria.mybooklist.projections.BookMinProjection;
import com.elria.mybooklist.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

//@Service is same as @Component, just to know
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional(readOnly = true)
    public List<BookMinDTO> findAll() {
        List<Book> bookMap = bookRepository.findAll();
        return bookMap.stream().map(BookMinDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public BookDTO findById(Long id) {
        Book result = bookRepository.findById(id).get();
        return new BookDTO(result);
    }

    @Transactional(readOnly = true)
    public List<BookMinDTO> findByTitle(String title) {
        List<BookMinProjection> bookMap = bookRepository.searchByTitle(title);
        return bookMap.stream().map(BookMinDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<BookMinDTO> findByList(Long listId) {
        List<BookMinProjection> bookMap = bookRepository.searchByList(listId);
        return bookMap.stream().map(BookMinDTO::new).collect(Collectors.toList());
    }
}
