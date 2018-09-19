package com.lupitsa.shop.service.impl;

import com.lupitsa.shop.dao.ProductRepository;
import com.lupitsa.shop.models.Product;
import com.lupitsa.shop.service.BaseService;
import com.lupitsa.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    protected JpaRepository<Product, Long> getRepository() {
        return productRepository;
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }


    @Override
    public List<Product> findByPrice(Double price) {
        return productRepository.findByPrice(price);
    }
    @Override
    public boolean saveProduct(Product product) {
        if (productRepository.findByName(product.getName()) == null) {
            productRepository.save(product);
            return true;

        }
        return false;
    }

}
