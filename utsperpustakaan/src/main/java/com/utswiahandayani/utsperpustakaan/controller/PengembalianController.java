package com.utswiahandayani.utsperpustakaan.controller;

import com.utswiahandayani.utsperpustakaan.model.Peminjaman;
import com.utswiahandayani.utsperpustakaan.model.Pengembalian;
import com.utswiahandayani.utsperpustakaan.repository.PeminjamanRepo;
import com.utswiahandayani.utsperpustakaan.repository.PengembalianRepo;
import com.utswiahandayani.utsperpustakaan.service.PeminjamanService;
import com.utswiahandayani.utsperpustakaan.service.PengembalianService;
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
public class PengembalianController {

    @Autowired
    PengembalianService pengembalianService;

    @Autowired
    private PengembalianRepo pengembalianRepo;

    @Autowired
    PeminjamanService peminjamanService;

    @Autowired
    private PeminjamanRepo peminjamanRepo;

    @GetMapping("/returning-data")
    public String returningData(Model model){
        List<Pengembalian> pengembalians = pengembalianRepo.findAll();
        model.addAttribute("listPengembalian",pengembalians);
        return "pengembalian_data";
    }

    @GetMapping("/add-pengembalian")
    public String addPengembalian(Model model) {
        Pengembalian pengembalian = new Pengembalian();
        List<Peminjaman> peminjaman = peminjamanRepo.getPeminjamanNative();
        model.addAttribute("pengembalian", pengembalian);
        model.addAttribute("getIdPeminjaman",peminjaman);
        return "tambah_pengembalian";
    }

    @PostMapping("/savePengembalian")
    public String savePengembalian(@ModelAttribute("pengembalian") Pengembalian pengembalian) {
        pengembalianService.savePengembalian(pengembalian);
        return "redirect:/returning-data";
    }

    @GetMapping("/update-pengembalian/{id}")
    public String updatePengembalian(@PathVariable( value = "id") String id, Model model) {
        Pengembalian pengembalian = pengembalianService.getPengembalianById(id);
        List<Peminjaman> peminjaman = peminjamanRepo.getPeminjamanNative();
        model.addAttribute("pengembalian",pengembalian);
        model.addAttribute("getIdPeminjaman",peminjaman);
        return "edit_pengembalian";
    }

    @GetMapping("/deletePengembalian/{id}")
    public String deletePengembalian(@PathVariable (value = "id") String id) {
        this.pengembalianService.deletePengembalianById(id);
        return "redirect:/returning-data";
    }
}
