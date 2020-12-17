//Kullanmadın

package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.service.PriceInfoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceInfoController {
    private final PriceInfoService priceInfoService;

    public PriceInfoController(PriceInfoService priceInfoService) {
        this.priceInfoService = priceInfoService;
    }
}
