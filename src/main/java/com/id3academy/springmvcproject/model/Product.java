package com.id3academy.springmvcproject.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Qualifier
@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name="product")
public class Product {

    @Id
    private Long Product_ID;
    private String SKU;
    public String Name;
    private String Product_URL;
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

    public Long getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(Long product_ID) {
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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getColor_Family() {
        return Color_Family;
    }

    public void setColor_Family(String color_Family) {
        Color_Family = color_Family;
    }

    public String getColor_Swatches() {
        return Color_Swatches;
    }

    public void setColor_Swatches(String color_Swatches) {
        Color_Swatches = color_Swatches;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getShoe_Size() {
        return Shoe_Size;
    }

    public void setShoe_Size(String shoe_Size) {
        Shoe_Size = shoe_Size;
    }

    public String getPants_Size() {
        return Pants_Size;
    }

    public void setPants_Size(String pants_Size) {
        Pants_Size = pants_Size;
    }

    public String getOccassion() {
        return Occassion;
    }

    public void setOccassion(String occassion) {
        Occassion = occassion;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getBadges() {
        return Badges;
    }

    public void setBadges(String badges) {
        Badges = badges;
    }

    public String getRating_Avg() {
        return Rating_Avg;
    }

    public void setRating_Avg(String rating_Avg) {
        Rating_Avg = rating_Avg;
    }

    public String getRating_Count() {
        return Rating_Count;
    }

    public void setRating_Count(String rating_Count) {
        Rating_Count = rating_Count;
    }

    public String getInventory_Count() {
        return Inventory_Count;
    }

    public void setInventory_Count(String inventory_Count) {
        Inventory_Count = inventory_Count;
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

    @Override
    public String toString() {
        return "Product{" +
                "Product_ID=" + Product_ID +
                ", SKU='" + SKU + '\'' +
                ", Name='" + Name + '\'' +
                ", Product_URL='" + Product_URL + '\'' +
                ", Thumbnail_URL='" + Thumbnail_URL + '\'' +
                ", Search_Keywords='" + Search_Keywords + '\'' +
                ", Description='" + Description + '\'' +
                ", Category='" + Category + '\'' +
                ", Category_ID=" + Category_ID +
                ", Brand='" + Brand + '\'' +
                ", Child_SKU='" + Child_SKU + '\'' +
                ", Child_Price='" + Child_Price + '\'' +
                ", Color='" + Color + '\'' +
                ", Color_Family='" + Color_Family + '\'' +
                ", Color_Swatches='" + Color_Swatches + '\'' +
                ", Size='" + Size + '\'' +
                ", Shoe_Size='" + Shoe_Size + '\'' +
                ", Pants_Size='" + Pants_Size + '\'' +
                ", Occassion='" + Occassion + '\'' +
                ", Season='" + Season + '\'' +
                ", Badges='" + Badges + '\'' +
                ", Rating_Avg='" + Rating_Avg + '\'' +
                ", Rating_Count='" + Rating_Count + '\'' +
                ", Inventory_Count='" + Inventory_Count + '\'' +
                '}';
    }
}
