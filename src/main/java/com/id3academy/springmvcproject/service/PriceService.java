package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.PriceRepository;
import com.id3academy.springmvcproject.dao.ProductRepository;
import com.id3academy.springmvcproject.model.Price;
import com.id3academy.springmvcproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    PriceRepository priceRepo = new PriceRepository();

    public List<Price> getAllPrice() {
        return priceRepo.getAllPrice();
    }

}
