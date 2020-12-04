package com.id3academy.springmvcproject.web;

import com.id3academy.springmvcproject.model.Product;
import com.id3academy.springmvcproject.service.SpringMvcProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class SpringMvcProjectRestController {
    @Autowired
    private SpringMvcProjectService springMvcProjectService;

    @RequestMapping(method = RequestMethod.GET,value="/product")
    public ResponseEntity<List<Product>> getAll(){
        List<Product> product = springMvcProjectService.findProduct();
        return ResponseEntity.ok(product);

    }
}
