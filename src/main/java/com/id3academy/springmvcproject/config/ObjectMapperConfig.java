package com.id3academy.springmvcproject.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfig {
    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper()
                .registerModules()
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }
}