package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.Payment;
import com.example.restapiendpoints.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders/{id}/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/api/orders/{id}/payments/{id}")
    public Optional getPayment(@PathVariable int id) {
        return paymentRepository.findById(id);
    }

    @PostMapping("/api/orders/{id}/payments/{id}")
    public void addPayment(@RequestBody Payment payment) {
        paymentRepository.save(payment);
    }

    @DeleteMapping("/api/orders/{id}/payments/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentRepository.deleteById(id);
    }

}
