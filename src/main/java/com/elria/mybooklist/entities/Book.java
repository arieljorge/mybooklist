package com.elria.mybooklist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String genres;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    private Integer status; // 0-complete; 1-ongoing; 2-hiato; 3-canceled;
    private Integer releaseYear;
    private Double score;

    /*
    you can name a variable here, but if the name conflicts with the DB keys,
    just use the annotation @Column(name = "name here") to change in te mapping.

    There is something interesting, the JPA Spring apparently would change the
    camelCase to snake_case. Nice.
     */

    public Book() {}

    public Book(long id, String title, String author, String genres, String imgUrl, String shortDescription, String longDescription, int status, int releaseYear, double score) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genres = genres;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.status = status;
        this.releaseYear = releaseYear;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(this.id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
