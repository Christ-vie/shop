package com.lupitsa.shop.service;

import com.lupitsa.shop.models.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface CategoryService extends BaseService<Category, Long> {

    Category findByName(String name);

    boolean saveCategory(Category category);


}
