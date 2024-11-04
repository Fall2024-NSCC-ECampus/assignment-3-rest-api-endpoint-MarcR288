package com.example.restapiendpoints.Controller;

import com.example.restapiendpoints.Entities.Company;
import com.example.restapiendpoints.Repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @PostMapping
    public void createCompany(@RequestBody Company company) {
        companyRepository.save(company);
    }

    @GetMapping("/api/companies/{id}")
    public Optional getCompanyById(@PathVariable int id) {
        return companyRepository.findById(id);
    }

    @DeleteMapping("/api/companies/{id}")
    public void deleteCompanyById(@PathVariable int id) {
        companyRepository.deleteById(id);
    }
}
