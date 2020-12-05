package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.model.Product;
import com.id3academy.springmvcproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
    public ModelAndView getAllProduct() {
        ModelAndView model = new ModelAndView();

        List<Product> productList = productService.getAllProduct();
        model.addObject("productList", productList);

        model.setViewName("product_list");
        return model;
    }
}
