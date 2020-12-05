package com.id3academy.springmvcproject.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DynamodbConfig {

    @Bean(name = "price")
    @ConfigurationProperties(prefix = "spring.second-db")
    public DataSource dataSource2() {
        return  DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcTemplate2")
    public JdbcTemplate jdbcTemplate2(@Qualifier("price") DataSource ds) {
        return new JdbcTemplate(ds);
    }
}
