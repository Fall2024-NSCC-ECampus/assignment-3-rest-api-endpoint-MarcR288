package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    double price;

    @OneToMany
    private List<Review> review;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Product(String name, double price, Order order) {
        this.name = name;
        this.price = price;
        this.order = order;
    }

    public Product(int id, String name, double price, Order order) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.order = order;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
