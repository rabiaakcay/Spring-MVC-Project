package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.ProductRepository;
import com.id3academy.springmvcproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();    }

    @Override
    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Product getProductId(long productId) {
        Optional< Product > optional = productRepository.findById(productId);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            throw new RuntimeException(" Product not found for id :: " + productId);
        }
        return product;    }

    @Override
    public void deleteProductId(long productId) {
        this.productRepository.deleteById(productId);

    }
}
