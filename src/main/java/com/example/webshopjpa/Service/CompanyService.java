package com.example.webshopjpa.Service;

import com.example.webshopjpa.Model.Company;
import com.example.webshopjpa.Repo.CompanyRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepoJPA companyRepoJPA;


    // Create
    public void Create(Company company) {
        companyRepoJPA.save(company);
    }
}
