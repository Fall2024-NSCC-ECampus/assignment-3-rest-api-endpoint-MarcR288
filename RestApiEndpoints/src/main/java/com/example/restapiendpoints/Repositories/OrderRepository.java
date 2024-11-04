package com.example.restapiendpoints.Repositories;

import com.example.restapiendpoints.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
