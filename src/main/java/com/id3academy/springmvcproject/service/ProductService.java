package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.ProductRepository;
import com.id3academy.springmvcproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo = new ProductRepository();

    public List<Product> getAllProduct() {
        return productRepo.getAllProduct();
    }

}
