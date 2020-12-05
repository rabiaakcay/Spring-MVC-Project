package com.id3academy.springmvcproject.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
public class AllProducts {

    private Long Product_ID;
    private String SKU;
    public String Name;
    private String Product_URL;
    private String Price;
    private String Retail_Price;
    private String Thumbnail_URL;
    private String Search_Keywords;
    private String Description;
    private String Category;
    private Long Category_ID;
    private String Brand;
    private String Child_SKU;
    private String Child_Price;
    private String Color;
    private String Color_Family;
    private String Color_Swatches;
    private String Size;
    private String Shoe_Size;
    private String Pants_Size;
    private String Occassion;
    private String Season;
    private String Badges;
    private String Rating_Avg;
    private String Rating_Count;
    private String Inventory_Count;
    private String Date_Created;


    @XmlElement(name = "AllProducts")
    private final List<AllProducts> AllProductsList = new ArrayList<>();


    public List<AllProducts> getAllProductsList() {
        return this.AllProductsList;
    }
}
