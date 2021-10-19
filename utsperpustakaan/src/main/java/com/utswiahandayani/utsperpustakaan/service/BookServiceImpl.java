package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Book;
import com.utswiahandayani.utsperpustakaan.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepo bookRepo;

    @Override
    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public void saveBook(Book book) { this.bookRepo.save(book); }

    @Override
    public Book getBookById(String id) {
        Optional<Book> optional = bookRepo.findById(id);
        Book book = null;
        if (optional.isPresent()) {
            book = optional.get();
        } else {
            throw new RuntimeException(" Book not found for id :: " + id);
        }
        return book;
    }

    @Override
    public void deleteBookById(String id) { this.bookRepo.deleteById(id); }
}
