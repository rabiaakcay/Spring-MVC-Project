package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.ProductRepository;
import com.id3academy.springmvcproject.exception.ProductNotFoundException;
import com.id3academy.springmvcproject.model.Product;
import com.id3academy.springmvcproject.model.Products;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//@AllArgsConstructor
@Service
public class SpringMvcProjectServiceImpl implements SpringMvcProjectService{


    private ProductRepository productRepository;


    private final RestTemplate restTemplate;

    public SpringMvcProjectServiceImpl(ProductRepository productRepository,RestTemplate restTemplate) {
         this.productRepository = productRepository;
         this.restTemplate = restTemplate;
    }

    @Override
    public List<Product> findProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findProduct(String Name) {
        return productRepository.findByName(Name);
    }

    @Override
    public Product findProduct(Long Product_ID) throws ProductNotFoundException {
        Product product = productRepository.findByProduct_ID(Product_ID);
        if(product == null) {
            throw new ProductNotFoundException("Currency not found with unit :" + Product_ID);
        }
        return product;    }

    @Override
    public void createProduct(Product product) {
        productRepository.create(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.update(product);
    }

    @Override
    public void deleteProduct(Long Product_ID) {
               productRepository.delete(Product_ID);
    }

    @Override
    public List<Product> getAll() {
        String url = "http://a.cdn.searchspring.net/help/feeds/searchspring.xml";
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);
        HttpHeaders header = new HttpHeaders() ;
        header.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        HttpEntity entity = new HttpEntity(header);
        Products pro   = restTemplate.postForObject(url,entity, Products.class);
        return pro.getProductList();
    }

    @Override
    public ResponseEntity<String> exchange() {
        String url = "http://a.cdn.searchspring.net";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity = new
                HttpEntity<String>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,
                entity, String.class);
        String responseBody = response.getBody();
        return response;
    }
}
