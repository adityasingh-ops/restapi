package com.aditya.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.findAll();
    }
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable  Long id) {
        return service.getProductById(id);
    }
    @GetMapping("/products/{name}")
    public List<Product> getProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
    @GetMapping("/products/price/{price}")
    public List<Product> getProductByPrice(@PathVariable double price) {
        return service.getProductByPrice(price);
    }
    @PostMapping("/product")
    public void saveProduct(@RequestBody  Product product) {
        service.saveProduct(product);
    }
}
