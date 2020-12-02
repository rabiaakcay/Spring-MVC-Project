package com.id3academy.springmvcproject.exception;

import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

}

