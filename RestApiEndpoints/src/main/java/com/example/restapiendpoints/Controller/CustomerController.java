package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.Customer;
import com.example.restapiendpoints.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository CustomerRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return CustomerRepository.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return CustomerRepository.save(customer);
    }

    @GetMapping("/api/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int id) {
        return customerRepository.findById(id)
                .map(ResponseEntity::ok).
                orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/api/products/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int id){
        customerRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
