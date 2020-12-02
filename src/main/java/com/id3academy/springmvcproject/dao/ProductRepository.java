package com.id3academy.springmvcproject.dao;

import com.id3academy.springmvcproject.model.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findByProduct_ID(Long Product_ID);
    List<Product> findByName(String Name);
    public void create(Product product);
    public Product update(Product product);
    public void delete(Long Product_ID);

}
