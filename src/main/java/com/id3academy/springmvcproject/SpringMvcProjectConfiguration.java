package com.id3academy.springmvcproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SpringMvcProjectConfiguration {

    @Autowired
    private SpringMvcProjectProperties springMvcProjectProperties;

    @PostConstruct
    public void init() {
        System.out.println("Display Exchange Rates :" + springMvcProjectProperties.isDisplayExchangeProduct());
    }
}
