package com.id3academy.springmvcproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.id3academy.springmvcproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class MultipleDBDaoImpl {
    @Autowired
    @Qualifier("jdbcTemplate1")
    private JdbcTemplate jdbcTemplate1;


    public List getAllProduct() {
        String sql1 = "select * from product";
        //get users list from db1
        List list1 = jdbcTemplate1.query(sql1, new ProductRowMapper());
        return list1;
    }

    class ProductRowMapper implements RowMapper{

        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setSKU(rs.getString("SKU"));
            product.setName(rs.getString("Name"));
            product.setProduct_URL(rs.getString("Product_URL"));
           // product.setPrice(rs.getString("Price"));
           // product.setRetail_Price(rs.getString("Retail_Price"));
            product.setThumbnail_URL(rs.getString("Thumbnail_URL"));
            product.setSearch_Keywords(rs.getString("Search_Keywords"));
            product.setDescription(rs.getString("Description"));
            product.setCategory(rs.getString("Category"));
            product.setCategory_ID(rs.getLong("Category_ID"));
            product.setBrand(rs.getString("Brand"));
            product.setChild_SKU(rs.getString("Child_SKU"));
            product.setChild_Price(rs.getString("Child_Price"));
            product.setColor(rs.getString("Color"));
            product.setColor_Family(rs.getString("Color_Family"));
            product.setColor_Swatches(rs.getString("Color_Swatches"));
            product.setSize(rs.getString("Size"));
            product.setShoe_Size(rs.getString("Shoe_Size"));
            product.setPants_Size(rs.getString("Pants_Size"));
            product.setOccassion(rs.getString("Occassion"));
            product.setSeason(rs.getString("Season"));
            product.setBadges(rs.getString("Badges"));
            product.setRating_Avg(rs.getString("Rating_Avg"));
            product.setRating_Count(rs.getString("Rating_Count"));
            product.setInventory_Count(rs.getString("Inventory_Count"));
           // product.setDate_Created(rs.getString("Date_Created"));

            return product;
        }
    }
}
