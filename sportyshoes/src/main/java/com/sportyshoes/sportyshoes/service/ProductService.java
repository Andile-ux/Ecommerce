package com.sportyshoes.sportyshoes.service;

import com.sportyshoes.sportyshoes.model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sportyshoes.sportyshoes.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.sportyshoes.sportyshoes.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private static List<Product> productList = new ArrayList<>();
    private static int productIdCounter = 1;

    public List<Product> getAllProducts() {
        return productList;
    }

    public void addProduct(Product product) {
        product.setId(productIdCounter++);
        productList.add(product);
    }
}
