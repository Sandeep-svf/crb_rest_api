package com.crb.crb.service;

import com.crb.crb.model.ProductModel;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IProductService {
    List<ProductModel> findAll();
}
