package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.Order;
import com.example.restapiendpoints.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getALlOrders(){
        return orderRepository.findAll();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return orderRepository.save(order);
    }

    @GetMapping("/api/orders/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable int id){
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()){
            return ResponseEntity.ok(order.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("api/orders/{id}")
    public ResponseEntity<Order> deleteOrderById(@PathVariable int id){
        orderRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
