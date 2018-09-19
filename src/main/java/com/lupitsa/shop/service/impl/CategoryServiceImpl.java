package com.lupitsa.shop.service.impl;

import com.lupitsa.shop.dao.CategoryRepository;
import com.lupitsa.shop.models.Category;
import com.lupitsa.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    protected JpaRepository<Category, Long> getRepository() {
        return categoryRepository;
    }

    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public boolean saveCategory(Category category) {
        if (categoryRepository.findByName(category.getName()) == null) {
            categoryRepository.save(category);
            return true;
        }

        return false;

    }
}
