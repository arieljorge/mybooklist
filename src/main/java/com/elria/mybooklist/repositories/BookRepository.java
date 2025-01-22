package com.elria.mybooklist.repositories;

import com.elria.mybooklist.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
