package com.will.springbootmall.dao;

import com.will.springbootmall.constant.ProductCategory;
import com.will.springbootmall.dto.ProductQueryParams;
import com.will.springbootmall.dto.ProductRequest;
import com.will.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
