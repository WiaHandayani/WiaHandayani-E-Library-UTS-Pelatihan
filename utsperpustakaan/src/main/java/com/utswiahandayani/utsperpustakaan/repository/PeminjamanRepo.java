package com.utswiahandayani.utsperpustakaan.repository;

import com.utswiahandayani.utsperpustakaan.model.Peminjaman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PeminjamanRepo extends JpaRepository<Peminjaman, String> {

    @Query(value = "select * from tb_peminjaman", nativeQuery = true)
    public List<Peminjaman> getPeminjamanNative();
}
