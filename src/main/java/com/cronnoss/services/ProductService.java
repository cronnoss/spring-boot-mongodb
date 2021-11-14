package com.cronnoss.services;

import com.cronnoss.commands.ProductForm;
import com.cronnoss.domain.Product;

import java.util.List;


public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
