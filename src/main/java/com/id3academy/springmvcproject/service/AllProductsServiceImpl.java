package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.AllProductsRepository;
import com.id3academy.springmvcproject.model.AllProducts;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AllProductsServiceImpl implements AllProductsService {

    private AllProductsRepository allProductsRepository;

    private final RestTemplate restTemplate;

    public AllProductsServiceImpl(AllProductsRepository allProductsRepository, RestTemplate restTemplate) {
        this.allProductsRepository = allProductsRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<AllProducts> getAllProducts() {
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
        AllProducts allProducts   = restTemplate.postForObject(url,entity, AllProducts.class);
        return allProducts.getAllProductsList();    }
}
