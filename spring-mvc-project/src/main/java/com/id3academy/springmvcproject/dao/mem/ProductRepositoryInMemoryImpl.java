package com.id3academy.springmvcproject.dao.mem;

import com.id3academy.springmvcproject.dao.ProductRepository;
import com.id3academy.springmvcproject.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductRepositoryInMemoryImpl implements ProductRepository {


    private final Map<Long, Product> productMap = new HashMap<>();


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findByProduct_ID(Long Product_ID) {
        return productMap.get(Product_ID);
    }

    @Override
    public List<Product> findByName(String Name) {
        return productMap.values().stream().filter(o -> o.Name.equals(Name))
                .collect(Collectors.toList());
    }

    @Override
    public void create(Product product) {

        product.setProduct_ID(new Date().getTime());
        productMap.put(product.getProduct_ID(), product);    }

    @Override
    public Product update(Product product) {
        productMap.replace(product.getProduct_ID(), product);
        return product;    }

    @Override
    public void delete(Long Product_ID) {
        productMap.remove(Product_ID);
    }
}
