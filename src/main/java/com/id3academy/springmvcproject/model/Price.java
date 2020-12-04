package com.id3academy.springmvcproject.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Price")
public class Price {

    private long id;
    private String Price;
    private String Date_Created;
    private String Retail_Price;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDate_Created() {
        return Date_Created;
    }

    public void setDate_Created(String date_Created) {
        Date_Created = date_Created;
    }

    public String getRetail_Price() {
        return Retail_Price;
    }

    public void setRetail_Price(String retail_Price) {
        Retail_Price = retail_Price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", Price='" + Price + '\'' +
                ", Date_Created='" + Date_Created + '\'' +
                ", Retail_Price='" + Retail_Price + '\'' +
                '}';
    }
}