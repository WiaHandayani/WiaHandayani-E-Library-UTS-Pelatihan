package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Peminjaman;
import com.utswiahandayani.utsperpustakaan.repository.PeminjamanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeminjamanServiceImpl implements PeminjamanService{

    @Autowired
    private PeminjamanRepo peminjamanRepo;

    @Override
    public List<Peminjaman> getAllPeminjaman() {
        return peminjamanRepo.findAll();
    }

    @Override
    public void savePeminjaman(Peminjaman peminjaman) { this.peminjamanRepo.save(peminjaman); }

    @Override
    public Peminjaman getPeminjamanById(String id) {
        Optional<Peminjaman> optional = peminjamanRepo.findById(id);
        Peminjaman peminjaman = null;
        if (optional.isPresent()) {
            peminjaman = optional.get();
        } else {
            throw new RuntimeException(" Peminjaman not found for id :: " + id);
        }
        return peminjaman;
    }

    @Override
    public void deletePeminjamanById(String id) { this.peminjamanRepo.deleteById(id); }
}
