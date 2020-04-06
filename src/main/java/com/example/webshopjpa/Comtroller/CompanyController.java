package com.example.webshopjpa.Comtroller;

import com.example.webshopjpa.Model.Company;
import com.example.webshopjpa.Model.Product;
import com.example.webshopjpa.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("/CompanyCreate")
    public String create(){

        return "CompanyCreate";
    }

    @PostMapping("/CompanyCreate")
    public String create (@ModelAttribute Company company){
        companyService.Create(company);
        return "redirect:/";
    }
}
