package com.id3academy.springmvcproject.controller;

import com.id3academy.springmvcproject.model.Product;
import com.id3academy.springmvcproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class MultipleDBController {

        @Autowired
        private ProductService productService;

        @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
        public ModelAndView getAllProduct() {
            ModelAndView model = new ModelAndView();

            List<Product> productList = productService.getAllProduct();
            model.addObject("productList", productList);

            model.setViewName("product_list");
            return model;
        }
    }

//
//    @Autowired
//    private ProductService productService;
//
//    // display list of product
//    @GetMapping("/")
//    public String viewHomePage(Model model) {
//        model.addAttribute("listProduct", productService.getAllProduct());
//        return "index";
//    }
//
//    @PostMapping("/saveProduct")
//    public String saveProduct(@ModelAttribute("product") Product product) {
//        // save product to database
//        productService.saveProduct(product);
//        return "redirect:/";
//    }
//
//    @GetMapping("/showFormForUpdate/{product_id}")
//    public String showFormForUpdate(@PathVariable(value = "product_id") long productId, Model model) {
//
//        // get product from the service
//        Product product = productService.getProductId(productId);
//
//        // set product as a model attribute to pre-populate the form
//        model.addAttribute("product", product);
//        return "update_product";
//    }
//
//    @GetMapping("/deleteProduct/{product_id}")
//    public String deleteEmployee(@PathVariable(value = "product_id") long productId) {
//
//        // call delete product method
//        this.productService.deleteProductId(productId);
//        return "redirect:/";
//    }
//}
