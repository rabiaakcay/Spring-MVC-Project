package com.id3academy.springmvcproject.web;

import com.id3academy.springmvcproject.model.Product;
import com.id3academy.springmvcproject.service.SpringMvcProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringMvcProjectController {
    @Autowired
    private SpringMvcProjectService springMvcProjectService;

    @GetMapping(value = "/",produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<Product>> restApi() {
        return ResponseEntity.ok(springMvcProjectService.getAll());

    }
}
