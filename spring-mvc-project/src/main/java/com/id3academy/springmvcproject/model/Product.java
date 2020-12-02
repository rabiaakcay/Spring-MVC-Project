package com.id3academy.springmvcproject.model;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="product")
public class Product {

//    public String Name;
    @Id
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

    public long getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(long product_ID) {
        Product_ID = product_ID;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProduct_URL() {
        return Product_URL;
    }

    public void setProduct_URL(String product_URL) {
        Product_URL = product_URL;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getRetail_Price() {
        return Retail_Price;
    }

    public void setRetail_Price(String retail_Price) {
        Retail_Price = retail_Price;
    }

    public String getThumbnail_URL() {
        return Thumbnail_URL;
    }

    public void setThumbnail_URL(String thumbnail_URL) {
        Thumbnail_URL = thumbnail_URL;
    }

    public String getSearch_Keywords() {
        return Search_Keywords;
    }

    public void setSearch_Keywords(String search_Keywords) {
        Search_Keywords = search_Keywords;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Long getCategory_ID() {
        return Category_ID;
    }

    public void setCategory_ID(Long category_ID) {
        Category_ID = category_ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getChild_SKU() {
        return Child_SKU;
    }

    public void setChild_SKU(String child_SKU) {
        Child_SKU = child_SKU;
    }

    public String getChild_Price() {
        return Child_Price;
    }

    public void setChild_Price(String child_Price) {
        Child_Price = child_Price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Product_ID=" + Product_ID +
                ", SKU='" + SKU + '\'' +
                ", Name='" + Name + '\'' +
                ", Product_URL='" + Product_URL + '\'' +
                ", Price='" + Price + '\'' +
                ", Retail_Price='" + Retail_Price + '\'' +
                ", Thumbnail_URL='" + Thumbnail_URL + '\'' +
                ", Search_Keywords='" + Search_Keywords + '\'' +
                ", Description='" + Description + '\'' +
                ", Category='" + Category + '\'' +
                ", Category_ID=" + Category_ID +
                ", Brand='" + Brand + '\'' +
                ", Child_SKU='" + Child_SKU + '\'' +
                ", Child_Price='" + Child_Price + '\'' +
                '}';
    }



}

