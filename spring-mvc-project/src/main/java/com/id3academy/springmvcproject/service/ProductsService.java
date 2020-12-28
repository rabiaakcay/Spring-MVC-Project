package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.ProductsDao;
import com.id3academy.springmvcproject.model.Products;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductsService {
    @Autowired
    private ProductsDao productsDao;

    public List<Products> document() {
        List<Products> productsList = new ArrayList<>();
        try {
            String urlString = "http://a.cdn.searchspring.net/help/feeds/searchspring.xml";

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new URL(urlString).openStream());
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Product");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    Products products = new Products();

                    products.setProduct_ID(eElement.getElementsByTagName("Product_ID").item(0).getTextContent());
                    products.setSKU(eElement.getElementsByTagName("SKU").item(0).getTextContent());
                    products.setName(eElement.getElementsByTagName("Name").item(0).getTextContent());
                    products.setProduct_URL(eElement.getElementsByTagName("Product_URL").item(0).getTextContent());
                    products.setPrice(eElement.getElementsByTagName("Price").item(0).getTextContent());
                    products.setRetail_Price(eElement.getElementsByTagName("Retail_Price").item(0).getTextContent());
                    products.setThumbnail_URL(eElement.getElementsByTagName("Thumbnail_URL").item(0).getTextContent());
                    products.setSearch_Keywords(eElement.getElementsByTagName("Search_Keywords").item(0).getTextContent());
                    products.setDescription(eElement.getElementsByTagName("Description").item(0).getTextContent());
                    products.setCategory(eElement.getElementsByTagName("Category").item(0).getTextContent());
                    products.setCategory_ID(eElement.getElementsByTagName("Category_ID").item(0).getTextContent());
                    products.setBrand(eElement.getElementsByTagName("Brand").item(0).getTextContent());
                    products.setChild_SKU(eElement.getElementsByTagName("Child_SKU").item(0).getTextContent());
                    products.setChild_Price(eElement.getElementsByTagName("Child_Price").item(0).getTextContent());
                    products.setColor(eElement.getElementsByTagName("Color").item(0).getTextContent());
                    products.setColor_Family(eElement.getElementsByTagName("Color_Family").item(0).getTextContent());
                    products.setColor_Swatches(eElement.getElementsByTagName("Color_Swatches").item(0).getTextContent());
                    products.setSize(eElement.getElementsByTagName("Size").item(0).getTextContent());
                    products.setShoe_Size(eElement.getElementsByTagName("Shoe_Size").item(0).getTextContent());
                    products.setPants_Size(eElement.getElementsByTagName("Pants_Size").item(0).getTextContent());
                    products.setOccassion(eElement.getElementsByTagName("Occassion").item(0).getTextContent());
                    products.setSeason(eElement.getElementsByTagName("Season").item(0).getTextContent());
                    products.setBadges(eElement.getElementsByTagName("Badges").item(0).getTextContent());
                    products.setRating_Avg(eElement.getElementsByTagName("Rating_Avg").item(0).getTextContent());
                    products.setRating_Count(eElement.getElementsByTagName("Rating_Count").item(0).getTextContent());
                    products.setInventory_Count(eElement.getElementsByTagName("Inventory_Count").item(0).getTextContent());
                    products.setDate_Created(eElement.getElementsByTagName("Date_Created").item(0).getTextContent());

                    productsDao.insertProducts(products);

                    productsList.add(products);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productsList;
    }

    public List<String> execute(String keyword){
        List<String> listProducts = productsDao.selectProducts(keyword);

        return listProducts;
    }
}
