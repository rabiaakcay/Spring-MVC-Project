package com.id3academy.springmvcproject.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MultipleDBConfig {
    @Bean(name = "product")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcTemplate1")
    public JdbcTemplate jdbcTemplate1(@Qualifier("product") DataSource dsMysql) {
        return new JdbcTemplate(dsMysql);
    }

    @Bean(name = "price")
    @ConfigurationProperties(prefix = "spring.second-db")
    public DataSource dataSource2() {
        return  DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcTemplate2")
    public JdbcTemplate jdbcTemplate2(@Qualifier("price") DataSource dsDynamoDB) {
        return new JdbcTemplate(dsDynamoDB);
    }
}
