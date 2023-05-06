package com.crb.crb.controller;

import com.crb.crb.model.ProductModel;
import com.crb.crb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService iProductService;


    @GetMapping(value = "/product")
    public List<ProductModel> getProduct(){
        //finds all the products
        List<ProductModel> products = iProductService.findAll();

        return products;
    }
}
