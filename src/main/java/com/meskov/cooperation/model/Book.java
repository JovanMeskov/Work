package com.meskov.cooperation.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "books")
public class Books extends BaseEntity {
    @NotNull
    @Column(name = "ID", insertable = false, updatable = false)
    private Integer ID;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "genre")
    private String genre;

    @ManyToOne()
    @JoinColumn(name = "authorID")
    private Author author;

    public Books() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
