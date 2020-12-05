package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.model.Price;
import com.id3academy.springmvcproject.model.Product;
import com.id3academy.springmvcproject.service.PriceService;
import com.id3academy.springmvcproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
    public ModelAndView getAllPrice() {
        ModelAndView model = new ModelAndView();

        List<Price> priceList = priceService.getAllPrice();
        model.addObject("priceList", priceList);

        model.setViewName("price_list");
        return model;
    }
}
