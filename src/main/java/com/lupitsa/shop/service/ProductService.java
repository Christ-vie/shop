package com.lupitsa.shop.service;

import com.lupitsa.shop.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface ProductService extends BaseService<Product, Long> {

    Product findByName(String name);

    boolean saveProduct(Product product);


    List<Product> findByPrice(Double price);


}
