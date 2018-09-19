package com.lupitsa.shop;

import com.lupitsa.shop.dao.CategoryRepository;
import com.lupitsa.shop.dao.ProductRepository;
import com.lupitsa.shop.models.Category;
import com.lupitsa.shop.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository) {
        return args -> {

            System.out.println("Testtttttttttttt");

            Category category = new Category("Electronics");

            /*categoryRepository.save(category);*/

        };
    }

}
