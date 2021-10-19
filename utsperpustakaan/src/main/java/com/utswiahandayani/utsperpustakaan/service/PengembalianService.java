package com.utswiahandayani.utsperpustakaan.service;


import com.utswiahandayani.utsperpustakaan.model.Pengembalian;

import java.util.List;

public interface PengembalianService {

    List<Pengembalian> getAllPengembalian();
    void savePengembalian(Pengembalian pengembalian);
    Pengembalian getPengembalianById(String id);
    void deletePengembalianById(String id);
}
