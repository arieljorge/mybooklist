package com.elria.mybooklist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    /*
    The BookRepository, only receive 2 parameter,
    so for that we cant declare a variable for
    BookList and Book, so we could compress these
    two in another class since if we don't, this
    class would be with a third propertie.
     */

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging() {}

    public Belonging(Book book, BookList bookList, Integer position) {
        this.id.setBook(book);
        this.id.setBookList(bookList);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
