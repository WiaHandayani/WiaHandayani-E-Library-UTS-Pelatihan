package com.utswiahandayani.utsperpustakaan.controller;

import com.utswiahandayani.utsperpustakaan.model.Book;
import com.utswiahandayani.utsperpustakaan.model.Category;
import com.utswiahandayani.utsperpustakaan.repository.BookRepo;
import com.utswiahandayani.utsperpustakaan.repository.CategoryRepo;
import com.utswiahandayani.utsperpustakaan.service.BookService;
import com.utswiahandayani.utsperpustakaan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@ComponentScan
public class BookController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    BookService bookService;

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/category-data")
    public String categoryData(Model model){
        List<Category> categories = categoryRepo.findAll();
        model.addAttribute("listCategory",categories);
        return "category_data";
    }

    @GetMapping("/book-data")
    public String bookData(Model model){
        List<Book> books = bookRepo.findAll();
        model.addAttribute("listBook",books);
        return "book_data";
    }

    @GetMapping("/add-category")
    public String addCategory(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "tambah_category";
    }

    @PostMapping("/saveCategory")
    public String saveCategory(@ModelAttribute("category") Category category) {
        categoryService.saveCategory(category);
        return "redirect:/category-data";
    }

    @GetMapping("/add-book")
    public String addBook(Model model) {
        Book book = new Book();
        List<Category> ktg = categoryRepo.getKategoriNative();
        model.addAttribute("book", book);
        model.addAttribute("listCtg",ktg);
        return "tambah_buku";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/book-data";
    }

    @GetMapping("/update-book/{id}")
    public String updateBook(@PathVariable( value = "id") String kode, Model model) {
        Book book = bookService.getBookById(kode);
        List<Category> ktg = categoryRepo.getKategoriNative();
        model.addAttribute("book", book);
        model.addAttribute("listCtg",ktg);
        return "edit_buku";
    }

    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable (value = "id") String kode) {
        this.bookService.deleteBookById(kode);
        return "redirect:/book-data";
    }

    @GetMapping("/update-category/{id}")
    public String updateCategory(@PathVariable( value = "id") String kode, Model model) {
        Category category = categoryService.getCategoryById(kode);
        model.addAttribute("category", category);
        return "edit_category";
    }

    @GetMapping("/deleteCategory/{id}")
    public String deleteEmployee(@PathVariable (value = "id") String kode) {
        this.categoryService.deleteCategoryById(kode);
        return "redirect:/category-data";
    }

}
