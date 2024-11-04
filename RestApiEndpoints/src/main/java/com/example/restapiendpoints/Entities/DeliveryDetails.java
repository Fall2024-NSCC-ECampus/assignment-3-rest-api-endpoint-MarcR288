package com.example.restapiendpoints.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DeliveryDetails {
    @Id
    private Long id;

    @OneToOne
    private Customer customer;

    private String deliveryDate;
    private String deliveryTime;
    private String deliveryType;
    private String deliveryDetails;

    public DeliveryDetails(Long id, Customer customer, String deliveryDate, String deliveryTime, String deliveryType, String deliveryDetails) {
        this.id = id;
        this.customer = customer;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.deliveryType = deliveryType;
        this.deliveryDetails = deliveryDetails;
    }

    public DeliveryDetails(Customer customer, String deliveryDate, String deliveryTime, String deliveryType, String deliveryDetails) {
        this.customer = customer;
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.deliveryType = deliveryType;
        this.deliveryDetails = deliveryDetails;
    }

    public DeliveryDetails() {

    }

    public DeliveryDetails(int id) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(String deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }
}
