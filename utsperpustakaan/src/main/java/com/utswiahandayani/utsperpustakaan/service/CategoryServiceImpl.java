package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Category;
import com.utswiahandayani.utsperpustakaan.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public void saveCategory(Category category) {
        this.categoryRepo.save(category);
    }

    @Override
    public Category getCategoryById(String id) {
        Optional<Category> optional = categoryRepo.findById(id);
        Category category = null;
        if (optional.isPresent()) {
            category = optional.get();
        } else {
            throw new RuntimeException(" Category not found for id :: " + id);
        }
        return category;
    }

    @Override
    public void deleteCategoryById(String id) {

        this.categoryRepo.deleteById(id);

    }
}
