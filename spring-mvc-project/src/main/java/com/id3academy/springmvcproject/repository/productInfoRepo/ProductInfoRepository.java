package com.id3academy.springmvcproject.repository.productInfoRepo;

import com.id3academy.springmvcproject.model.productInfo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,Integer> {
}
