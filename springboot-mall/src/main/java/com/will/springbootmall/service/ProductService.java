package com.will.springbootmall.service;

import com.will.springbootmall.dto.ProductRequest;
import com.will.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
