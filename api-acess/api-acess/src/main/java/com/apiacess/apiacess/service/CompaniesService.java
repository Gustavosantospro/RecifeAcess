package com.apiacess.apiacess.service;

import com.apiacess.apiacess.model.Company;
import com.apiacess.apiacess.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompaniesService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company save(Company company) {
        return companyRepository.save(company);
    }


    public List<Company> findAll() {
        return (List<Company>) companyRepository.findAll();
    }
}
