package com.example.webshopjpa.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

    @Entity
    public class Product {

        @Id
        private long productID;

        private String productName;
        private double price;
        private String description;
        Company company = new Company();
        Category category = new Category();

        public Product(){}
        public Product(long id, String name, double price, String description /*Company company, Category category*/) {
            this.productID = id;
            this.productName = name;
            this.price = price;
            this.description = description;
        /*this.company = company;
        this.category = category;*/

        }

        @javax.persistence.Id
        public long getId() {
            return productID;
        }

        public void setId(long id) {
            this.productID = id;
        }

        public String getName() {
            return productName;
        }

        public void setName(String name) {
            this.productName = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }


