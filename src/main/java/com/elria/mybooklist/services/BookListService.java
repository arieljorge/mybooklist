package com.elria.mybooklist.services;

import com.elria.mybooklist.dto.BookListDTO;
import com.elria.mybooklist.entities.BookList;
import com.elria.mybooklist.projections.BookMinProjection;
import com.elria.mybooklist.repositories.BookListRepository;
import com.elria.mybooklist.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookListService {

    @Autowired
    private BookListRepository bookListRepository;

    @Autowired
    private BookRepository bookRepository;

    @Transactional(readOnly = true)
    public List<BookListDTO> findAll() {
        List<BookList> bookLists = bookListRepository.findAll();
        return bookLists.stream().map(BookListDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int targetIndex) {
        List<BookMinProjection> list = bookRepository.searchByList(listId);
        BookMinProjection obj = list.remove(sourceIndex);
        list.add(targetIndex, obj);

        int minimun = Math.min(sourceIndex, targetIndex);
        int maximun = Math.max(sourceIndex, targetIndex);

        for (int i = minimun; i <= maximun; i++) {
            bookListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
