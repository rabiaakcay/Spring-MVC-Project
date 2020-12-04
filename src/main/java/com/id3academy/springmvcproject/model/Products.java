package com.id3academy.springmvcproject.model;

import lombok.Data;
import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@XmlRootElement(name = "ArrayOfCurrency")
@XmlAccessorType(XmlAccessType.FIELD)

public class Products {
    @XmlElement(name = "Product")
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return this.productList;
    }
}
