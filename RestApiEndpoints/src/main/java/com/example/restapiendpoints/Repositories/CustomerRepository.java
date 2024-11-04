package com.example.restapiendpoints.Repositories;

import com.example.restapiendpoints.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
