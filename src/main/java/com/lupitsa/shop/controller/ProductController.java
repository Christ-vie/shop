package com.lupitsa.shop.controller;


import com.lupitsa.shop.models.Product;
import com.lupitsa.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController  {
    @Autowired
    ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>>getAll(){
        return new ResponseEntity<List<Product>>(productService.findAll(), HttpStatus.ACCEPTED);
    }
    @PostMapping
    public ResponseEntity<Boolean> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Boolean>(productService.saveProduct(product),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable(name= "id" )long id){
        return new ResponseEntity<Product>(productService.find(id),HttpStatus.OK);
    }
    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.save(product);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name="id") long id){
        productService.deleteById(id);
    }


}
