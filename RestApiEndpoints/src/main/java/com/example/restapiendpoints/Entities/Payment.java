package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private double amount;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;


    public Payment(Order order, double amount, String type) {
        this.order = order;
        this.amount = amount;
        this.type = type;
    }

    public Payment(int id, String type, double amount, Order order) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.order = order;
    }

    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
