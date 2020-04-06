package com.example.webshopjpa.Service;

import com.example.webshopjpa.Model.Company;
import com.example.webshopjpa.Model.Product;
import com.example.webshopjpa.Repo.CompanyRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepoJPA companyRepoJPA;

    //se
    public List<Company> see(){

        return companyRepoJPA.findAll();
    }

    // Create
    public void Create(Company company) {
        companyRepoJPA.save(company);
    }
}
