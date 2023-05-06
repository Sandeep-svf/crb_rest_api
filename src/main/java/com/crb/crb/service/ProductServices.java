package com.crb.crb.service;

import com.crb.crb.model.ProductModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices implements IProductService{


    @Override
    public List<ProductModel> findAll() {
        //creating an object of ArrayList
        ArrayList<ProductModel> products = new ArrayList<ProductModel>();
        //adding products to the List
        products.add(new ProductModel("sam","maurya",2000.0,26));
        products.add(new ProductModel("sam","maurya",2000.0,26));
        products.add(new ProductModel("sam","maurya",2000.0,26));
        products.add(new ProductModel("sam","maurya",2000.0,26));
        products.add(new ProductModel("sam","maurya",2000.0,26));
        products.add(new ProductModel("sam","maurya",2000.0,26));
        products.add(new ProductModel("sam","maurya",2000.0,26));

        //returns a list of product
        return products;
    }
}
