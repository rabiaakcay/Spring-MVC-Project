// Kullanmadın

package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.service.ProductInfoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductInfoController {
    private final ProductInfoService productInfoService;

    public ProductInfoController(ProductInfoService productInfoService) {
        this.productInfoService = productInfoService;
    }
}

