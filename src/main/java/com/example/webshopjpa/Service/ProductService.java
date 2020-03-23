package com.example.webshopjpa.Service;

import com.example.webshopjpa.Model.Product;
import com.example.webshopjpa.Repo.ProductRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

@Autowired
    ProductRepoJPA productRepoJPA;

//se
    public List<Product> see(){

        return productRepoJPA.findAll();
    }

//create
public void create(Product product){
    productRepoJPA.save(product);
}

//Delete
    public void delete(long id){
        productRepoJPA.deleteById(id);
    }

//update
    //find
    public Product findProduct(long id){
        return productRepoJPA.getOne(id);
    }

    //update
    public void update(Product product){
        productRepoJPA.save(product);
    }
}
