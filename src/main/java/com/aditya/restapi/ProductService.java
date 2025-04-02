package com.aditya.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public ProductService() {
    }
    @Autowired
    ProductRepo repo;

    public List<Product> findAll() {
        return repo.findAll();
    }
    public void saveProduct(Product product) {
        repo.save(product);
    }
    public List<Product> getAllProduct() {
        List<Product> list = repo.findAll();
        for(Product p : list){
            System.out.println(p);
        }

        return list;

    }
    public List<Product> getProductByName(String name) {
        return repo.findByName(name);
    }
    public List<Product> getProductByPrice(double price) {
        return repo.findByPrice(price);
    }
    public Product getProductById(Long id) {
        try {
             return repo.findById(id).orElse(null);
         }catch (Exception e){
             return null;
         }
    }
}
