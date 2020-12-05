package com.id3academy.springmvcproject.dao;

import com.id3academy.springmvcproject.model.Price;
import com.id3academy.springmvcproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Transactional
@Repository
public class PriceRepository {

    @Autowired
    @Qualifier("jdbcTemplate2")
    private JdbcTemplate jdbcTemplate2;

    public List getAllPrice() {
        String sql2 = "select * from price";
        //get price list from db2
        List priceList = jdbcTemplate2.query(sql2, new PriceRowMapper());
        return priceList;
    }

    class PriceRowMapper implements RowMapper {

        @Override
        public Price mapRow(ResultSet rs, int rowNum) throws SQLException {
            Price price = new Price();
            price.setPrice(rs.getString("Price"));
            price.setRetail_Price(rs.getString("Retail_Price"));
            price.setDate_Created(rs.getString("Date_Created"));

            return price;
        }
    }

        }
