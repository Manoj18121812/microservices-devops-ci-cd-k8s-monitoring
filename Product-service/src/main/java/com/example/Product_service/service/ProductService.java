package com.example.Product_service.service;

import com.example.Product_service.Entity.Product;
import com.example.Product_service.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<Product> listAll() {

        return repo.findAll();

    }

    public void save(Product product) {

        repo.save(product);

    }

    public void delete(Long id) {

        repo.deleteById(id);

    }

    public Product get(Long id) {

        return repo.findById(id).orElse(null);

    }
}