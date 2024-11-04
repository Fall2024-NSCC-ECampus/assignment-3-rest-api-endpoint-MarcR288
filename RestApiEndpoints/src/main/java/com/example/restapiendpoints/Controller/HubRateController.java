package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.HubRates;
import com.example.restapiendpoints.Repositories.HubRatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hub-rates")
public class HubRateController {

    @Autowired
    private HubRatesRepository hubRatesRepository;

    @GetMapping
    public List<HubRates> getAllHubRates(){
        return hubRatesRepository.findAll();
    }

    @PostMapping
    public void saveHubRates(@RequestBody HubRates hubRates){
        hubRatesRepository.save(hubRates);
    }

    @GetMapping("/api/hub-rates/{id}")
    public ResponseEntity<HubRates> getHubRatesById(@PathVariable int id){
        Optional<HubRates> hubRates = hubRatesRepository.findById(id);
        if(hubRates.isPresent()){
            return ResponseEntity.ok(hubRates.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/api/hub-rates/{id}")
    public ResponseEntity<Void> deleteHubRatesById(@PathVariable int id){
        Optional<HubRates> hubRates = hubRatesRepository.findById(id);
        if(hubRates.isPresent()){
            hubRatesRepository.delete(hubRates.get());
        }
        return ResponseEntity.noContent().build();
    }
}
