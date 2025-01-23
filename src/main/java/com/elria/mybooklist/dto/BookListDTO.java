package com.elria.mybooklist.dto;

import com.elria.mybooklist.entities.BookList;

public class BookListDTO {

    private Long id;
    private String name;

    public BookListDTO() {}

    public BookListDTO(BookList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
