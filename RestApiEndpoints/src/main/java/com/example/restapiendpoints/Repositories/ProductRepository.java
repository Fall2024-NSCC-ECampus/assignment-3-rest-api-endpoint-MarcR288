package com.example.restapiendpoints.Repositories;

import com.example.restapiendpoints.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
