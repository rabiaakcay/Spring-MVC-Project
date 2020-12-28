package com.id3academy.springmvcproject.dao;

import com.id3academy.springmvcproject.controller.Test;
import com.id3academy.springmvcproject.model.Products;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@Repository
public class ProductsDao {

    //Kullanmıyorsun ama şema normalde application.prop'de tanımlanıp böyle kullanılmalı
    @Value("${products.schema.name}")
    private String productsSchemaName;

    @Autowired
    private Test test;

    @Autowired
    @Qualifier("mysqlJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void insertProducts(Products productsModel){
       jdbcTemplate.batchUpdate("INSERT INTO products.products (Product_ID,\n" +
               "SKU,\n" +
               "Name,\n" +
               "Product_URL,\n" +
               "Price,\n" +
               "Retail_Price,\n" +
               "Thumbnail_URL,\n" +
               "Search_Keywords,\n" +
               "Description,\n" +
               "Category,\n" +
               "Category_ID,\n" +
               "Brand,\n" +
               "Child_SKU,\n" +
               "Child_Price,\n" +
               "Color,\n" +
               "Color_Family,\n" +
               "Color_Swatches,\n" +
               "Size,\n" +
               "Shoe_Size,\n" +
               "Pants_Size,\n" +
               "Occassion,\n" +
               "Season,\n" +
               "Badges,\n" +
               "Rating_Avg,\n" +
               "Rating_Count,\n" +
               "Inventory_Count,\n" +
               "Date_Created) values (?,?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?,?,?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1,productsModel.getProduct_ID());
                ps.setString(2, productsModel.getSKU());
                ps.setString(3, productsModel.getName());
                ps.setString(4, productsModel.getProduct_URL());
                ps.setString(5, productsModel.getPrice());
                ps.setString(6, productsModel.getRetail_Price());
                ps.setString(7, productsModel.getThumbnail_URL());
                ps.setString(8, productsModel.getSearch_Keywords());
                ps.setString(9, productsModel.getDescription());
                ps.setString(10, productsModel.getCategory());
                ps.setString(11, productsModel.getCategory_ID());
                ps.setString(12, productsModel.getBrand());
                ps.setString(13, productsModel.getChild_SKU());
                ps.setString(14, productsModel.getChild_Price());
                ps.setString(15, productsModel.getColor());
                ps.setString(16, productsModel.getColor_Family());
                ps.setString(17, productsModel.getColor_Swatches());
                ps.setString(18, productsModel.getSize());
                ps.setString(19, productsModel.getShoe_Size());
                ps.setString(20, productsModel.getPants_Size());
                ps.setString(21, productsModel.getOccassion());
                ps.setString(22, productsModel.getSeason());
                ps.setString(23, productsModel.getBadges());
                ps.setString(24, productsModel.getRating_Avg());
                ps.setString(25, productsModel.getRating_Count());
                ps.setString(26, productsModel.getInventory_Count());
                ps.setString(27, productsModel.getDate_Created());
            }
            @Override
            public int getBatchSize() {
                return 1;
            }
        });
    }

    public List<String> selectProducts(String keyword){
        String sql="SELECT Product_ID,\n" +
                "SKU,\n" +
                "Name,\n" +
                "Product_URL,\n" +
                "Price,\n" +
                "Retail_Price,\n" +
                "Thumbnail_URL,\n" +
                "Search_Keywords,\n" +
                "Description,\n" +
                "Category,\n" +
                "Category_ID,\n" +
                "Brand,\n" +
                "Child_SKU,\n" +
                "Child_Price,\n" +
                "Color,\n" +
                "Color_Family,\n" +
                "Color_Swatches,\n" +
                "Size,\n" +
                "Shoe_Size,\n" +
                "Pants_Size,\n" +
                "Occassion,\n" +
                "Season,\n" +
                "Badges,\n" +
                "Rating_Avg,\n" +
                "Rating_Count,\n" +
                "Inventory_Count,\n" +
                "Date_Created\n" +
                "FROM products WHERE Product_ID="+keyword+"";
        List<String> products= jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(Products.class));
        return products;
    }
}
