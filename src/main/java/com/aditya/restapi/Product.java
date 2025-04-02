package com.aditya.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private boolean available;
    public Product() {
    }
    public Product(String name, String description, double price, int quantity, boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", available=" + available +
                '}';
    }
}
