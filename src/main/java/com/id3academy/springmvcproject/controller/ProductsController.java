package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.job.GetProductsJob;
import com.id3academy.springmvcproject.model.Products;
import com.id3academy.springmvcproject.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Document;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductsController {

    private final ProductsService productsService;
    private final GetProductsJob getProductsJob;

        @GetMapping
    public ResponseEntity<byte[]> getProductsFromUrl() {
        Products products = new Products();
        byte[] x = productsService.getProductsFromUrl();
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/octet-stream");
        return new ResponseEntity<>(x, headers, HttpStatus.OK);
//        return productsService.getProductsFromUrl();
    }
//    @GetMapping
//    public Document getProductsFromUrl() {
//        Document document = new Products();
//         document = productsService.getProductsFromUrl();
//        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
//        headers.add("Content-Type", "application/octet-stream");
//        return new ResponseEntity<>(x, headers, HttpStatus.OK);
//        return productsService.getProductsFromUrl();
    }



