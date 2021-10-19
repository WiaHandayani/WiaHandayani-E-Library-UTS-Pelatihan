package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategory();
    void saveCategory(Category category);
    Category getCategoryById(String id);
    void deleteCategoryById(String id);

}
