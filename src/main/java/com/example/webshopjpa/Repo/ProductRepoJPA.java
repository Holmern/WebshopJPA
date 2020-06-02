package com.example.webshopjpa.Repo;

import com.example.webshopjpa.Model.Company;
import com.example.webshopjpa.Model.Product;
import net.bytebuddy.TypeCache;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepoJPA extends JpaRepository<Product, Integer> {

   // List<Product> findByCompany(Company company, Sort sort);
}
