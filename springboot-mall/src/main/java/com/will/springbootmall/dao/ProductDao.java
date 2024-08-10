package com.will.springbootmall.dao;

import com.will.springbootmall.dto.ProductRequest;
import com.will.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
