package com.id3academy.springmvcproject.repository;

import com.id3academy.springmvcproject.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,String> {
}
