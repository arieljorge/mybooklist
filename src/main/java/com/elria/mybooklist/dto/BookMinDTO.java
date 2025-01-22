package com.elria.mybooklist.dto;

import com.elria.mybooklist.entities.Book;

public class BookMinDTO {

    private Long id;
    private String title;
    private String genres;
    private String imgUrl;
    private String shortDescription;
    private Double score;

    public  BookMinDTO(){}

    public BookMinDTO(Book entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.genres = entity.getGenres();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.score = entity.getScore();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenres() {
        return genres;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Double getScore() {
        return score;
    }
}
