package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;


@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @ManyToOne
    private Product product;

    @JoinColumn(name="customer_id")
    private String author;

    private int rating;

    public Review(int id) {
        this.id = id;
    }

    public Review(String title, String description, String author, int rating) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.rating = rating;
    }

    public Review(int id, String title, String description, String author, int rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.rating = rating;
    }

    public Review() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
