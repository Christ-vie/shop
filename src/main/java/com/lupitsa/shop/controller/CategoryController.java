package com.lupitsa.shop.controller;

import com.lupitsa.shop.models.Category;
import com.lupitsa.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getAll() {
        return new ResponseEntity<List<Category>>(categoryService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> saveCategory(@RequestBody Category category) {
        return new ResponseEntity<Boolean>(categoryService.saveCategory(category), HttpStatus.CREATED);
    }


    @GetMapping("/{id}") // /categories/9
    public ResponseEntity<Category> get(@PathVariable(name = "id") long id) {
        return new ResponseEntity<Category>(categoryService.find(id), HttpStatus.OK);
    }

    @PutMapping
    public Category update(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @DeleteMapping("/{id}") // /categories/9
    public void delete(@PathVariable(name = "id") long id) {
        categoryService.deleteById(id);
    }

}
