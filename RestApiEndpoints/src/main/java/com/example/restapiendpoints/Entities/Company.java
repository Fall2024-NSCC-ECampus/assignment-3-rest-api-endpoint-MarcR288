package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> product;

    public Product getProduct() {
        return (Product) product;
    }

    public void setProduct(Product product) {
        this.product = (List<Product>) product;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
