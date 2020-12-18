package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductsController {
    private final ProductsService productsService;

    @GetMapping("/test")
    public ResponseEntity getTest() {
        HttpHeaders responseHeader = new HttpHeaders();
        try {
            productsService.document();
            return new ResponseEntity<>("true", responseHeader, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("false", responseHeader, HttpStatus.OK);
        }
    }

}
