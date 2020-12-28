package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@RestController
public class Test {
    @Autowired
    private ProductsService productsService;

    @RequestMapping("/")
    public ModelAndView viewHomePage(@Param("keyword") String keyword) {
        List<String> listProducts = productsService.execute(keyword);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("listProducts", listProducts);
        modelAndView.addObject("keyword", keyword);

        return modelAndView;
    }
}
