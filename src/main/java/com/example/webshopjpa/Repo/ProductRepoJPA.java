package com.example.webshopjpa.Repo;

import com.example.webshopjpa.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepoJPA extends JpaRepository<Product, Long> {
}
