package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Peminjaman;

import java.util.List;

public interface PeminjamanService {

    List<Peminjaman> getAllPeminjaman();
    void savePeminjaman(Peminjaman peminjaman);
    Peminjaman getPeminjamanById(String id);
    void deletePeminjamanById(String id);

}
