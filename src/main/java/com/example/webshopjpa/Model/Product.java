package com.example.webshopjpa.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
    @Table(name = "product")
    public class Product implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long productID;

        private String productName;
        private double price;
        private String description;

        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "company_id", nullable = false)
        protected Company company;

        public Product(){}
        public Product(long id, String name, double price, String description, Company company) {
            this.productID = id;
            this.productName = name;
            this.price = price;
            this.description = description;
            this.company = company;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", company=" + company +
                '}';
    }
}


