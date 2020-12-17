package com.id3academy.springmvcproject.job;

import com.id3academy.springmvcproject.config.ProductsServiceConfig;
import com.id3academy.springmvcproject.model.Products;
import com.id3academy.springmvcproject.service.ProductsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class GetProductsJob {
    private final ProductsService productsService;
    private final ProductsServiceConfig productsServiceConfig;

//    public void execute(){
//        log.info("Job started");
//        List<Products> products = productsService.execute();
//        log.info("Job completed");
//    }
}
