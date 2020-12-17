//Kullanmadın

package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.repository.productInfoRepo.ProductInfoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductInfoService {
    private final ProductInfoRepository productInfoRepository;

    public ProductInfoService(ProductInfoRepository productInfoRepository) {
        this.productInfoRepository = productInfoRepository;
    }
}