package com.id3academy.springmvcproject.service;

import com.id3academy.springmvcproject.dao.MultipleDBDaoImpl;
import com.id3academy.springmvcproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductService {

    @Autowired
    MultipleDBDaoImpl productDao = new MultipleDBDaoImpl();


    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

    List< Product > getAllProduct();
    void saveProduct(Product product);
    Product getProductId(long productId);
    void deleteProductId(long productId);


}
