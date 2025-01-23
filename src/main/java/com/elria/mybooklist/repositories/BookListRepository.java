package com.elria.mybooklist.repositories;

import com.elria.mybooklist.entities.BookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookListRepository extends JpaRepository<BookList, Long> {}
