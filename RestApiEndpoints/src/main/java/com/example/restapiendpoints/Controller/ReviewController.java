package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.Review;
import com.example.restapiendpoints.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping
    public List<Review> getAllReviews(){
        return reviewRepository.findAll();
    }

    @PostMapping
    public void addReview(@RequestBody Review review){
        reviewRepository.save(review);
    }

    @GetMapping("/api/products/{id}/review/{id}")
    public Optional getReview(@PathVariable int id){
        return reviewRepository.findById(id);
    }

    @DeleteMapping("/api/products/{id}/review/{id}")
    public void deleteReview(@PathVariable int id){
        reviewRepository.deleteById(id);
    }
}
