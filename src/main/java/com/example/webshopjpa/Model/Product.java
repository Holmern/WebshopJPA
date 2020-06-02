package com.example.webshopjpa.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productid")
    private int productid;

     private String productName;
     private double price;
     private String description;




     @ManyToOne(fetch = FetchType.LAZY, optional = false)
     @JoinColumn(name="company", referencedColumnName = "id")
     private Company company;

     public Product(){}
     public Product(int id, String name, double price, String description, Company company) {
         this.productid = id;
         this.productName = name;
         this.price = price;
         this.description = description;
         this.company = company;
     }


     public int getProductid() {
         return productid;
     }

     public void setProductid(int id) {
         this.productid = id;
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
                "productID=" + productid +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}


