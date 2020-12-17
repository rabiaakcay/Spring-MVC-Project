package com.id3academy.springmvcproject.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("products.service")
public class ProductsServiceConfig {
    private String url;
}
