package com.elria.mybooklist.repositories;

import com.elria.mybooklist.entities.Book;
import com.elria.mybooklist.projections.BookMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(nativeQuery = true, value = """
        SELECT  TB_BOOK.ID,
                TB_BOOK.TITLE,
                TB_BOOK.IMG_URL AS imgUrl,
                TB_BOOK.SHORT_DESCRIPTION AS shortDescription,
                TB_BOOK.GENRES,
                TB_BOOK.SCORE,
                TB_BELONGING.POSITION
        FROM TB_BOOK INNER JOIN TB_BELONGING ON TB_BOOK.ID = TB_BELONGING.BOOK_ID
        WHERE TB_BELONGING.LIST_ID = :listId ORDER BY TB_BELONGING.POSITION
    """)
    List<BookMinProjection> searchByList(Long listId);
}
