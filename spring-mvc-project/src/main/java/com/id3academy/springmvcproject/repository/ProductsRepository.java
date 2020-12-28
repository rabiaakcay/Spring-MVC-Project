package com.id3academy.springmvcproject.repository;

import com.id3academy.springmvcproject.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products,String> {
}
