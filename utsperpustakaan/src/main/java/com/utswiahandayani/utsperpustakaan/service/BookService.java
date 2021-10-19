package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Book;
import com.utswiahandayani.utsperpustakaan.model.Category;

import java.util.List;

public interface BookService {

    List<Book> getAllBook();
    void saveBook(Book book);
    Book getBookById(String id);
    void deleteBookById(String id);

}
