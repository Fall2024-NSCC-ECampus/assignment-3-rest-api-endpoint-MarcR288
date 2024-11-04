package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;

@Entity

public class HubRates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rate;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public HubRates(String rate, Company company) {
        this.rate = rate;
        this.company = company;
    }

    public HubRates(Long id, String rate, Company company) {
        this.id = id;
        this.rate = rate;
        this.company = company;
    }

    public HubRates() {

    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
