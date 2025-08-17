package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deletecategory(long categoryId);

    String deletecategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
