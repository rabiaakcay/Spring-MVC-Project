package com.id3academy.springmvcproject.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {
    @Bean(name = "productsListDataSource")
    @Qualifier("productsListDataSource")
    @ConfigurationProperties("spring.datasource.hikari")
    public HikariDataSource mysqlDatasource() {
        return (HikariDataSource) DataSourceBuilder.create().build();
    }


    @Bean(name = "mysqlJdbcTemplate")
    public JdbcTemplate mysqlJdbcTemplate(@Qualifier("productsListDataSource") DataSource datasource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(datasource);
        return jdbcTemplate;
    }
}
