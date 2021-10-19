package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Pengembalian;
import com.utswiahandayani.utsperpustakaan.repository.PengembalianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PengembalianServiceImpl implements PengembalianService{

    @Autowired
    private PengembalianRepo pengembalianRepo;

    @Override
    public List<Pengembalian> getAllPengembalian() { return pengembalianRepo.findAll(); }

    @Override
    public void savePengembalian(Pengembalian pengembalian) { this.pengembalianRepo.save(pengembalian); }

    @Override
    public Pengembalian getPengembalianById(String id) {

        Optional<Pengembalian> optional = pengembalianRepo.findById(id);
        Pengembalian pengembalian = null;
        if (optional.isPresent()) {
            pengembalian = optional.get();
        } else {
            throw new RuntimeException(" Pengembalian not found for id :: " + id);
        }
        return pengembalian;
    }

    @Override
    public void deletePengembalianById(String id) { this.pengembalianRepo.deleteById(id); }
}
