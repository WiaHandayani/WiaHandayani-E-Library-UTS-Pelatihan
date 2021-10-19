package com.utswiahandayani.utsperpustakaan.repository;

import com.utswiahandayani.utsperpustakaan.model.Pengembalian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PengembalianRepo extends JpaRepository<Pengembalian, String> {
}
