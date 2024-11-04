package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id", nullable=false, unique = true)
    private int order_id;

    @OneToMany(mappedBy = "order")
    private List<Product> product;

    private int quantity;

    @OneToOne(mappedBy = "customerId")
    private Customer customer;


    public Order(List<Product> product, int quantity, Customer customer) {
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Order(int order_id, List<Product> product, int quantity, Customer customer) {
        this.order_id = order_id;
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Order() {

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
