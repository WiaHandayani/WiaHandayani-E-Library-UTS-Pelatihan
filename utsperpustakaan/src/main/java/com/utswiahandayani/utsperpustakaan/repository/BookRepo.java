package com.utswiahandayani.utsperpustakaan.repository;

import com.utswiahandayani.utsperpustakaan.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookRepo extends JpaRepository<Book, String> {

    @Query(value = "select * from tb_buku", nativeQuery = true)
    public List<Book> getBookNative();

}
