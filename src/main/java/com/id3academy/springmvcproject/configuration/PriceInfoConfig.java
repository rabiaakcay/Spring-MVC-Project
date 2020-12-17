package com.id3academy.springmvcproject.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "priceEntityManagerFactory",transactionManagerRef = "priceTransactionManager", basePackages = {"com.id3academy.springmvcproject.repository.priceInfoRepo" })
public class PriceInfoConfig {
    @Bean(name = "priceDataSource")
    @ConfigurationProperties(prefix = "spring.price.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "priceEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean priceEntityManagerFactory(EntityManagerFactoryBuilder builder,
                                                                            @Qualifier("priceDataSource") DataSource dataSource) {
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        return builder.dataSource(dataSource).properties(properties)
                .packages("com.id3academy.springmvcproject.model.priceInfo").persistenceUnit("Price").build();
    }

    @Bean(name = "priceTransactionManager")
    public PlatformTransactionManager priceTransactionManager(
            @Qualifier("priceEntityManagerFactory") EntityManagerFactory priceEntityManagerFactory) {
        return new JpaTransactionManager(priceEntityManagerFactory);
    }
}