package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.model.AllProducts;
import com.id3academy.springmvcproject.model.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AllProductsService {

    List<AllProducts> getAllProducts();
}
