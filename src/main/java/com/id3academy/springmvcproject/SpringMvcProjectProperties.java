package com.id3academy.springmvcproject;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="SpringMvcProject")
public class SpringMvcProjectProperties {

    private boolean displayExchangeProduct = false;

    public boolean isDisplayExchangeProduct() {
        return displayExchangeProduct;
    }

    public void setDisplayExchangeProduct(boolean displayExchangeProduct) {
        this.displayExchangeProduct = displayExchangeProduct;
    }
}
