package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.exception.ProductNotFoundException;
import com.id3academy.springmvcproject.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpringMvcProjectService {

    List<Product> findProduct();
    List<Product> findProduct(String Name);
    Product findProduct(Long Product_ID) throws ProductNotFoundException;
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long Product_ID);

    List<Product> getAll();
    ResponseEntity<String> exchange();
}
